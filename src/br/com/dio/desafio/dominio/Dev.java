package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;

    public Dev() {
        conteudosInscritos = new LinkedHashSet<>();
        conteudosConcluidos = new LinkedHashSet<>();
    }

    public Dev(String nome) {
        this();
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevs().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();

        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public void exibirConteudosInscritos() {
        if (conteudosInscritos.isEmpty()) {
            System.out.println("Não há conteúdos inscritos!");
            return;
        }
        conteudosInscritos.forEach(System.out::println);
    }

    public void exibirConteudosConcluidos() {
        if (conteudosConcluidos.isEmpty()) {
            System.out.println("Não há conteúdos concluídos!");
            return;
        }
        conteudosConcluidos.forEach(System.out::println);
    }

    public double calcularTotalXP() {
       return conteudosConcluidos.stream().map(Conteudo::calcularXP).reduce(0.0, Double::sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosInscritos(), dev.getConteudosInscritos()) && Objects.equals(getConteudosConcluidos(), dev.getConteudosConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudosConcluidos());
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}

package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate DATA_INICIO;
    private final LocalDate DATA_FIM;
    private Set<Conteudo> conteudos;
    private Set<Dev> devs;

    public Bootcamp() {
        conteudos = new LinkedHashSet<>();
        devs = new HashSet<>();
        DATA_INICIO = LocalDate.now();
        DATA_FIM = DATA_INICIO.plusDays(45);
    }

    public Bootcamp(String descricao, String nome) {
        this();
        this.descricao = descricao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public LocalDate getDATA_FIM() {
        return DATA_FIM;
    }

    public LocalDate getDATA_INICIO() {
        return DATA_INICIO;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void exibirConteudos() {
        conteudos.forEach(System.out::println);
    }

    public void exibirDevs() {
        devs.forEach(System.out::println);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDATA_INICIO(), bootcamp.getDATA_INICIO()) && Objects.equals(getDATA_FIM(), bootcamp.getDATA_FIM()) && Objects.equals(getConteudos(), bootcamp.getConteudos()) && Objects.equals(getDevs(), bootcamp.getDevs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDATA_INICIO(), getDATA_FIM(), getConteudos(), getDevs());
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nDescrição: " + descricao +
                "\nData início: " + DATA_INICIO +
                "\nData fim: " + DATA_FIM;
    }
}

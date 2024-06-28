package br.com.dio.desafio.dominio;

import java.util.Objects;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;

    public Conteudo() {
    }

    public Conteudo(String descricao, String titulo) {
        this.descricao = descricao;
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract double calcularXP();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteudo conteudo = (Conteudo) o;
        return Objects.equals(getTitulo(), conteudo.getTitulo()) && Objects.equals(getDescricao(), conteudo.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getDescricao());
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nDescrição: " + descricao;
    }
}

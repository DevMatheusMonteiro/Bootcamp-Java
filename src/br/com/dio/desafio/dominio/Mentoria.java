package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(LocalDate data, String descricao, String titulo) {
        super(descricao, titulo);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nData: " + data;
    }
}

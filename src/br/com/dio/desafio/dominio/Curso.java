package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso() {
    }


    public Curso(int cargaHoraria, String descricao, String titulo) {
        super(descricao, titulo);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarga horária: " + cargaHoraria;
    }
}

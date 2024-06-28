import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso = new Curso(23,"Aprenda Java collections", "Java Collections");
        Conteudo mentoria = new Mentoria(LocalDate.of(2024,12,20), "Mentoria tal que faz aquilo la", "Mentoria");

        Bootcamp bootcamp = new Bootcamp("Bootcamp para aprender java do básico ao avançado", "Bootcamp Java DIO");

        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev matheus = new Dev("Matheus");
        Dev camila = new Dev("Camila");

        matheus.inscreverBootcamp(bootcamp);
        matheus.progredir();
        matheus.progredir();
        camila.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos do bootcamp");
        bootcamp.exibirConteudos();

        System.out.println(matheus);
        System.out.println("Conteudos inscritos: ");
        matheus.exibirConteudosInscritos();
        System.out.println(camila);
        System.out.println("Conteudos inscritos: ");
        camila.exibirConteudosInscritos();

        System.out.println(matheus);
        System.out.println("Conteudos concluidos: ");
        matheus.exibirConteudosConcluidos();
        System.out.println(camila);
        System.out.println("Conteudos concluidos: ");
        camila.exibirConteudosConcluidos();

        System.out.println(matheus);
        System.out.println("Total de xp: " + matheus.calcularTotalXP());
        System.out.println(camila);
        System.out.println("Total de xp: " + camila.calcularTotalXP());
    }
}
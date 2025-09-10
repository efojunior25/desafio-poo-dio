package src;

import src.br.com.dio.desafio.dominio.Bootcamp;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Dev;
import src.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso de Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Xp de Camila: " + devCamila.calcularXp());

        System.out.println("------");

        Dev devEdson = new Dev();
        devEdson.setNome("Edson");
        devEdson.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Edson: " + devEdson.getConteudosInscritos());
        devEdson.progredir();
        devEdson.progredir();
        devEdson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Edson: " + devEdson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Edson: " + devEdson.getConteudosConcluidos());
        System.out.println("Xp de Edson: " + devEdson.calcularXp());


    }
}


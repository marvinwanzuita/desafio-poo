package JavaDIO.DesafioPOO;

import JavaDIO.DesafioPOO.dominio.Bootcamp;
import JavaDIO.DesafioPOO.dominio.Curso;
import JavaDIO.DesafioPOO.dominio.Dev;
import JavaDIO.DesafioPOO.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring");
        curso2.setDescricao("Descrição curso Spring");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        System.out.println();
        Dev devMarvin = new Dev();
        devMarvin.setNome("Marvin");
        devMarvin.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devMarvin.getNome() +
                " " + devMarvin.getConteudosInscritos());
        devMarvin.progredir();
        System.out.println("Conteúdos Concluídos " + devMarvin.getNome() +
                " " + devMarvin.getConteudosConcluidos());
        System.out.println("XP: " + devMarvin.calcularTotalXp());

        System.out.println();

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() +
                " " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Concluídos " + devCamila.getNome() +
                " " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        
    }
}

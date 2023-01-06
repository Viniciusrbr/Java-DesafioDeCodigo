import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("descrição do curso de  Java");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("descrição do curso de Python");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*instanciando 1 bootcamp 2 devs para se inscreverem no bootcamp */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);

        devVinicius.progredir();
        devVinicius.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Vinicius:" + devVinicius.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vinicius:" + devVinicius.getConteudosConcluidos());
        System.out.println("XP:" + devVinicius.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
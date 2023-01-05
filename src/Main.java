import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setCargaHoraria(4);
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}

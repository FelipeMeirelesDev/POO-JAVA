package notasAlunos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Notas aluno = new Notas();

        System.out.println("Digite o nome do Aluno: ");
        aluno.nome = scanner.nextLine();
        System.out.println("Digite a note 01 do Aluno: ");
        aluno.nota1 = scanner.nextDouble();
        System.out.println("Digite a note 02 do Aluno: ");
        aluno.nota2 = scanner.nextDouble();
        System.out.println("Digite a note 03 do Aluno: ");
        aluno.nota3 = scanner.nextDouble();

        aluno.notaCalculada = aluno.CalcularNotas();

        if (aluno.notaCalculada < 60){
            System.out.println("O aluno " + aluno.nome + " teve a media de " + aluno.notaCalculada);
            System.out.println("REPROVADO!");
        } else {
            System.out.println("O aluno " + aluno.nome + " teve a media de " + aluno.notaCalculada);
            System.out.println("APROVADO!");
        }

    }
}

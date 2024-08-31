package dadosPessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DadosPessoa pessoa = new DadosPessoa();

        System.out.println("Digite o seu nome: ");
        pessoa.nome = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        pessoa.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a sua cidade: ");
        pessoa.cidade = scanner.nextLine();
        System.out.println("Digite o seu E-Mail: ");
        pessoa.email = scanner.nextLine();

        pessoa.mostrarDados();

        scanner.close();
    }
}

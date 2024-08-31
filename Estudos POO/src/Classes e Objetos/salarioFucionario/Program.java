package salarioFucionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do Funcionario:");
        funcionario.nome = scanner.nextLine();
        System.out.println("Digite o salario do funcionario:R$");
        funcionario.salario = scanner.nextDouble();
        System.out.println("Digite o valor da taxa:R$");
        funcionario.taxa = scanner.nextDouble();

        Double salarioLiquido = funcionario.desconto();

        System.out.println(funcionario.nome +", R$" + salarioLiquido);

        System.out.println("Digite o aumento (%) sobre o salario do funcionario:");
        funcionario.porcentagem = scanner.nextDouble();

        salarioLiquido = funcionario.aumento();

        System.out.println("Salario Atualizado: ");
        System.out.println(funcionario.nome +", R$" + salarioLiquido);
    }
}

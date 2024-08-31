package Banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ContaBancaria cliente = new ContaBancaria();

        System.out.println("Digite o Nome do Cliente: ");
        cliente.nome = scanner.nextLine();
        System.out.println("Digite o número da conta do Cliente:");
        cliente.numeroConta = scanner.nextLine();

        do{
            System.out.println("Digite a opção desejada: ");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Exibir Saldo");
            System.out.println("[4] sair (Finalizar Programa)");
            cliente.opcao = scanner.nextLine();

            if (cliente.opcao.equals("1"))
                cliente.deposito();
            else if (cliente.opcao.equals("2"))
                cliente.sacar();
            else if (cliente.opcao.equals("3"))
                cliente.exibirSaldo();

        }while (!cliente.opcao.equals("4"));

        scanner.close();
    }
}

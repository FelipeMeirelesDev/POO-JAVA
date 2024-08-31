package Banco;

import java.util.Scanner;

public class ContaBancaria {

    Scanner scanner = new Scanner(System.in);

    String nome;
    String numeroConta;
    Double saldo = 0.0;
    Double valor;
    String opcao;

    public void deposito(){
        System.out.println("Digite o valor a ser depositado: ");
        valor = scanner.nextDouble();
        scanner.nextLine();
        saldo += valor;
    }

    public void sacar(){
        System.out.println("Digite o valor a ser Sacado: ");
        valor = scanner.nextDouble();
        scanner.nextLine();
        saldo -= valor;
    }

    public void exibirSaldo(){
        System.out.println("Saldo Atual da conta:R$" + saldo);
    }

}

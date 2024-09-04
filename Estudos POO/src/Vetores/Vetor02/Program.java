package Vetor02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Produtos[] vet = new Produtos[n];

        for (int i = 0; i < vet.length; i++){  /*vet.length = n*/
            scanner.nextLine();
            String nome = scanner.nextLine();
            double preco = scanner.nextDouble();
            vet[i] = new Produtos(nome, preco);
        }

        double soma = 0.0;
        for(int i = 0; i < vet.length; i++) {
            soma += vet[i].getPreco();
        }

        System.out.println(soma/3);
        scanner.close();
    }
}

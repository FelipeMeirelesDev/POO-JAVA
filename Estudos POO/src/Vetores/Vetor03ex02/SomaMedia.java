package Vetor03ex02;

import java.util.Locale;
import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        /* Faça um programa para ler N números reais.
        * Imprima a soma e a média deles*/
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vet = new double[n];

        double soma = 0.0;

        for (int i = 0; i < n; i++){
            vet[i] = scanner.nextDouble();
            soma += vet[i];
        }

        System.out.println("A soma dos números:" + soma);
        System.out.println("A média:" + soma/n);

        scanner.close();
    }
}

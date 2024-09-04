package Vetor01;

import java.util.Locale;
import java.util.Scanner;

public class Vetor01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] vet = new double[n];

        for (int i=0; i < n; i++){
            vet[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i < n; i++){
            soma += vet[i];
        }

        System.out.println(soma);

        scanner.close();

    }
}

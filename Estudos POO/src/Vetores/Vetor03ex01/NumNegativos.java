package Vetor03ex01;

import java.util.Locale;
import java.util.Scanner;

public class NumNegativos {
    public static void main(String[] args) {
        /* Faça um programa que leia um número inteiro positivo N (Máximo = 10) e depois N números inteiros
        * e armazene-os em um vetor. Depois mostrar na tela todos os números negativos lidos.*/

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] vet = new int [n];

        for (int i = 0; i < n; i++){
            vet[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++){
            if(vet[i] < 0){
                System.out.println(vet[i]);
            }
        }

        scanner.close();
    }
}

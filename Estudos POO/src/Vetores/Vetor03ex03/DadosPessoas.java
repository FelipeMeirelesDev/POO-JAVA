package Vetor03ex03;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        /* Fazer um programa que leia nome,idade e altura.
        * Depois mostrar a média das alturas das pessoas.
        * E mostrar a porcentagem de pessoas com menos de 16 anos.
        * Bem como o nome dessas pessoas caso houver.*/
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int[] idades = new int[n];
        int[] alvo = new int [n];
        String[] nomes = new String[n];
        double[] altura = new double[n];
        int somaIdades = 0;
        double somaAlturas = 0.0;
        int contPessoasMenores = 0;

        for (int i = 0; i < n; i++){
            System.out.println("Digite os dados da pessoa " + (i+1) + ":");
            System.out.println("Digite o nome da pessoa:");
            nomes[i] = scanner.nextLine();
            System.out.println("Digite a idade da pessoa:");
            idades[i] = scanner.nextInt();
            System.out.println("Digite a altura da pessoa:");
            altura[i] = scanner.nextDouble();
            scanner.nextLine();
            somaIdades += idades[i];
            somaAlturas += altura[i];
            if (idades[i] < 16){
                contPessoasMenores++;
                alvo[i] = 1;
            }
        }

        double porcentagemMenor16 = ((double) contPessoasMenores / n) * 100;
        System.out.println("A média de altura das pessoas é:" + (somaAlturas/n));
        System.out.println("A porcentagem de pessoas menores de 16 é %" + porcentagemMenor16);

        System.out.println("As pessoas menores de 16 anos são:");
        for (int i = 0; i < n; i++){
            if (alvo[i] > 0){ /* alvo[i] > 0 = idade[i] < 16 */
                System.out.println(nomes[i]);
            }
        }


    }
}

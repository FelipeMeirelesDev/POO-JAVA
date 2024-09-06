package Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n,m;
        int procurar;

        System.out.println("Digite o valor de N:");
        n = scanner.nextInt();
        System.out.println("Digite o valor de M:");
        m = scanner.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mat[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.println("Digite o número para a procura na matriz:");
        procurar = scanner.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == procurar){
                    System.out.printf("Posição %d,%d\n",i+1,j+1);
                    System.out.printf("A sua Esquerda: %d\n",mat[i][j-1]);
                    System.out.printf("A sua Direita: %d\n",mat[i][j+1]);
                    System.out.printf("Acima: %d\n",mat[i-1][j]);
                    System.out.printf("Abaixo: %d\n",mat[i+1][j]);
                }
            }
        }

        scanner.close();
    }
}

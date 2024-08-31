package produtoEstoque;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Estoque produto = new Estoque();
        System.out.println("Dados do Produto:");
        System.out.println("Nome:");
        produto.nome = scanner.nextLine();
        System.out.println("Digite o valor do produto:");
        produto.valor = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        produto.quantidade = scanner.nextInt();

        System.out.println("Dados do Produto:");
        System.out.printf(produto.toString());
        System.out.println();
        System.out.println("Digite o número de produtos para ser adicionado:");
        int quantidade = scanner.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println();
        System.out.println("Atualização dos Dados: " + produto.toString());

        System.out.println();
        System.out.println("Digite o número de produtos para ser removido:");
        quantidade = scanner.nextInt();
        produto.removeProdutos(quantidade);

        System.out.println();
        System.out.println("Atualização dos Dados: " + produto.toString());

        scanner.close();
    }
}

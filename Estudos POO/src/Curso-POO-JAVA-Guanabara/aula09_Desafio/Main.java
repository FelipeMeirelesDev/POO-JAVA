package aula09_Desafio;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[3];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Pedro", 22, "M");
        pessoa[1] = new Pessoa("Maria", 25, "F");

        livro[0] = new Livro("Aprendendo Java", "Gustavo Guanabara", 300, pessoa[0]);
        livro[1] = new Livro("Aprendendo Python", "Gustavo Guanabara", 250, pessoa[1]);
        livro[2] = new Livro("Java Avançado", "Gustavo Guanabara",800,pessoa[2]);

        System.out.println(livro[0].detalhes());
    }
}

package dadosPessoa;

public class DadosPessoa {
    String nome;
    int idade;
    String cidade;
    String email;

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("E-mail: " + email);
    }
}

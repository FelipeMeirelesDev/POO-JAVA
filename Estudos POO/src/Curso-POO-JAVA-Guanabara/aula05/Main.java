package aula05;

public class Main {
    public static void main(String[] args) {

        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1111);
        pessoa1.setDono("Felipe Meireles");
        pessoa1.setSaldo(1500);
        pessoa1.setStatus(true);
        pessoa1.setTipo("CC");
        pessoa1.estadoAtual();
    }
}

package Veiculos;

public class Autodromo {
    public static void main(String[] args) {
        Carro civic = new Carro();
        civic.setChassi("847562");
        //civic.ligar();

        Moto z400 = new Moto();
        z400.setChassi("825631");
        //z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}

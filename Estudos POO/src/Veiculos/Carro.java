package Veiculos;

public class Carro extends Veiculo{

    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado!");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }
}

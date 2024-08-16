package DesafioDioBanco;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato DesafioDioBanco.Conta Corrente ===");
        super.imprimirInformacoesComuns();
    }

}

package DesafioDioBanco;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato DesafioDioBanco.Conta Poupança ===");
        super.imprimirInformacoesComuns();
    }
}

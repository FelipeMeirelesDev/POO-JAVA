package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void Construtor(){
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro.");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem débito.");
        }else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(double v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta.");
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }

    public void sacar(double v){
        if(this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else {
                System.out.println("Saldo insuficiente para saque");
            }
        }else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucessor por " + this.getDono());
            } else {
                System.out.println("Impossivel pagar uma conta fechada.");
            }
        }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}


package produtoEstoque;

public class Estoque {
    public String nome;
    public Double valor;
    public int quantidade;

    public Double valorTotalNoEstoque(){
        return valor * quantidade;
    }

    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade){
        this.quantidade -= quantidade;
    }
    public String toString(){
        return "Nome: " + nome +
                ", R$" + valor + ", " +
                quantidade + " unidades " +
                "valor total:R$" + quantidade*valor;
    }
}

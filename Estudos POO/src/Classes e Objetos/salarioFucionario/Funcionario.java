package salarioFucionario;

public class Funcionario {
    public String nome;
    public Double salario;
    public Double taxa;
    public Double salarioTotal;
    public Double porcentagem;

    public Double desconto(){
        salarioTotal = salario - taxa;
        return salarioTotal;
    }

    public Double aumento(){
        salarioTotal = salario + (salario*porcentagem/100);
        salarioTotal -= taxa;
        return salarioTotal;
    }
}

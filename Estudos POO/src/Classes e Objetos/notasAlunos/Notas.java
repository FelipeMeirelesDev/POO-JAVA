package notasAlunos;

public class Notas {

    public String nome;
    public Double nota1;
    public Double nota2;
    public Double nota3;
    public Double notaCalculada;

    public Double CalcularNotas(){
        Double nota = nota1+nota2+nota3;
        return nota;
    }
}

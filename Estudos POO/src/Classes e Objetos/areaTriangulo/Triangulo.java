package areaTriangulo;

public class Triangulo {

    public double a;
    public double b;
    public double c;

    public Double area(){
        double p = (a + b + c) / 2.00;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}

package areaTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entrada das medidas do triângulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Entrada das medidas do triângulo Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("O Triângulo X area: %.4f%n",areaX);
        System.out.printf("O Triângulo y area: %.4f%n",areaY);

        if (areaX > areaY){
            System.out.println("Area X é maior");
        } else{
            System.out.println("Area Y é maior");
        }

        scanner.close();
    }
}

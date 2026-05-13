package poo;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

//    private static double triangleAreaCalc() {
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle(); // Novo objeto - Instanciação da classe
        y = new Triangle();
        
        Locale.setDefault(Locale.ENGLISH);
        System.out.println("Digite os lados do triângulo X:");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Digite os lados do triângulo Y:");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.calcArea();
        double areaY = y.calcArea();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A área do triângulo X é maior.");
        } else if (areaY > areaX) {
            System.out.println("A área do triângulo Y é maior.");
        } else {
            System.out.println("Os dois triângulos possuem a mesma área.");
        }

        scanner.close();
    }
}

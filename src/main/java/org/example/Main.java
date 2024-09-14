package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculadorSolucionesCuadratica();
    }

    public static void calculadorSolucionesCuadratica() {
        Scanner scanner = new Scanner(System.in);
        double a = obtenerCoeficiente(scanner, "A");
        double b = obtenerCoeficiente(scanner, "B");
        double c = obtenerCoeficiente(scanner, "C");

        if (a == 0) {
            System.out.println("La ecuación no es cuadrática. El coeficiente A es 0.");
            return;
        }

        double discriminante = calcularDiscriminante(a, b, c);
        realizarCalculos(a, b, discriminante);
    }

    public static double obtenerCoeficiente(Scanner scanner, String coeficiente) {
        while (true) {
            System.out.print("Ingrese el coeficiente " + coeficiente + ": ");
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un valor numérico.");
                scanner.next();
            }
        }
    }

    public static double calcularDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void realizarCalculos(double a, double b, double discriminante) {
        if (discriminante > 0) {
            double x1 = calcularPrimeraSolucion(a, b, discriminante);
            double x2 = calcularSegundaSolucion(a, b, discriminante);
            System.out.println("Las soluciones son: ");
            System.out.println("x1 : "+x1);
            System.out.println("x2 : "+x2);

        } else if (discriminante == 0) {
            double x1 = calcularSolucionUnica(a, b);
            System.out.println("La solución es: "+x1);
        } else {
            System.out.println("Las soluciones son complejas.");
        }
    }

    public static double calcularPrimeraSolucion(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public static double calcularSegundaSolucion(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static double calcularSolucionUnica(double a, double b) {
        return -b / (2 * a);
    }
}




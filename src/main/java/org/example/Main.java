

package org.example;
import java.util.Scanner;

public class Main {
    public static String Calculo(int x1, int x2, int y1, int y2) {
        int pendiente = (y2 - y1)/(x2 -x1);
        System.out.println("La pendiente de la recta es " + pendiente);
        int termino_independiente = y1 - pendiente * x1;
        System.out.println("El término independiente es " + termino_independiente);
        return "Y = " + pendiente + "*X + " + termino_independiente;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese los valores de los puntos:");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        String recta = Calculo(x1, x2, y1, y2);
        System.out.println("La ecuación de la recta es: " + recta);
    }
}
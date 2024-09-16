

package org.example;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  
   public static void main(String[] args) {
        resolverEcuaciones();
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


    //AX + BY = C
    //DX + EY = F

    public static void resolverEcuaciones(){
        Scanner scanner = new Scanner(System.in);
        double a = obtenerCoeficiente(scanner, "A");
        double b = obtenerCoeficiente(scanner, "B");
        double c = obtenerCoeficiente(scanner, "C");
        double d = obtenerCoeficiente(scanner, "D");
        double e = obtenerCoeficiente(scanner, "E");
        double f = obtenerCoeficiente(scanner, "F");

        double[] solucion = resolverSistema(a,b,c,d,e,f);
        if (solucion != null) {
            System.out.println("La solucion es: ");
            System.out.println("X = "+solucion[0]);
            System.out.println("Y = "+solucion[1]);
        } else {
            System.out.println("La solucion no existe");
        }
        scanner.close();
    }

    public static double[] resolverSistema(double a, double b, double c, double d, double e, double f) {
        double x;
        double y;

        if (a != 0) {
            double denominador = d * b - a * e;
            if (denominador != 0) {
                y = (d * c - a * f) / denominador;
                x = (c - b * y) / a;
                return new double[]{x, y};
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
  
   public static String Calculo(int x1, int x2, int y1, int y2) {
        int pendiente = (y2 - y1)/(x2 -x1);
        System.out.println("La pendiente de la recta es " + pendiente);
        int termino_independiente = y1 - pendiente * x1;
        System.out.println("El término independiente es " + termino_independiente);
        return "Y = " + pendiente + "*X + " + termino_independiente;
    }

      // Cuadrado
    public static double perimetroCuadrado(double lado) {
        try {
            validarLado(lado);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return lado * 4;
    }

    public static double areaCuadrado(double lado) {
        try {
            validarLado(lado);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return lado * lado;
    }

    // Rectángulo
    public static double perimetroRectangulo(double base, double altura) {
        try {
            validarBaseAltura(base, altura);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return (base * 2) + (altura * 2);
    }

    public static double areaRectangulo(double base, double altura) {
        try {
            validarBaseAltura(base, altura);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return base * altura;
    }

    // Círculo
    public static double perimetroCirculo(double radio) {
        double pi = 3.1416;
        try {
            validarRadio(radio);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return 2 * pi * radio;
    }

    public static double areaCirculo(double radio) {
        double pi = 3.1416;
        try {
            validarRadio(radio);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return pi * radio * radio;
    }

    // Esfera
    public static double areaEsfera(double radio) {
        double pi = 3.1416;
        try {
            validarRadio(radio);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return 4 * pi * radio * radio;
    }

    public static double volumenEsfera(double radio) {
        double pi = 3.1416;
        try {
            validarRadio(radio);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return (4.0 / 3.0) * pi * radio * radio * radio;
    }

    // Cubo
    public static double perimetroCubo(double lado) {
        try {
            validarLado(lado);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return 12 * lado;
    }

    public static double areaCubo(double lado) {
        try {
            validarLado(lado);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return 6 * lado * lado;
    }

    public static double volumenCubo(double lado) {
        try {
            validarLado(lado);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return lado * lado * lado;
    }

    // Cono
    public static double areaCono(double radio, double altura) {
        double pi = 3.1416;
        try {
            validarRadioAltura(radio, altura);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        double areaCirculo = areaCirculo(radio);
        double areaTriangulo = Math.sqrt((radio * radio) + (altura * altura)) * pi * radio;
        return areaCirculo + areaTriangulo;
    }

    public static double volumenCono(double radio, double altura) {
        double pi = 3.1416;
        try {
            validarRadioAltura(radio, altura);
        } catch (IllegalArgumentException e) {
            return 0;
        }
        return (pi * radio * radio * altura) / 3;
    }

    // Validacion
    private static void validarLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado no puede ser menor o igual a 0");
        }
    }

    private static void validarBaseAltura(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura no pueden ser menores o iguales a 0");
        }
    }

    private static void validarRadio(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio no puede ser menor o igual a 0");
        }
    }

    private static void validarRadioAltura(double radio, double altura) {
        if (radio <= 0 || altura <= 0) {
            throw new IllegalArgumentException("El radio y la altura no pueden ser menores o iguales a 0");
        }
}

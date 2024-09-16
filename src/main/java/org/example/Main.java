

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

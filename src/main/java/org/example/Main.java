package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //Actividad 3
    //Cuadrado:
    // Perimetro: lado x 4
    // Area: lado x lado
    public static float perimetroCuadrado(float lado) {
        return lado * 4;
    }

    public static float areaCuadrado(float lado) {
        return lado * lado;
    }

    //Rectángulo:
    // Perimetro: (base x 2) + (altura x 2)
    // Area: base x altura
    public static float perimetroRectangulo(float base, float altura) {
        return (base * 2) + (altura * 2);
    }

    public static float areaRectangulo(float base, float altura) {
        return base * altura;
    }

    //Círculo:
    // Perimetro: 2 x pi x radio
    // Area: pi x radio x radio
    public static double perimetroCirculo(float radio) {
        return 2 * Math.PI * radio;
    }

    public static double areaCirculo(float radio) {
        return Math.PI * radio * radio;
    }

    //Esfera:
    // Area: 4 x pi x radio x radio
    // Volumen: (4/3) x pi x radio x radio x radio
    public static double areaEsfera(float radio) {
        return 4 * areaCirculo(radio);
    }

    public static double volumenEsfera(float radio) {
        return ((double) 4 / 3) * Math.PI * radio * radio * radio;
    }

    //Cubo:
    // Perimetro: 12 x lado
    // Volumen: lado x lado x lado
    // Area: 6 x lado x lado
    public static float perimetroCubo(float lado) {
        return 3 * perimetroCuadrado(lado);
    }

    public static float areaCubo(float lado) {
        return 6 * areaCuadrado(lado);
    }

    public static float volumenCubo(float lado) {
        return areaCuadrado(lado) * lado;
    }

    //Cono:
    // Area: pi x radio x radio + raiz cuadrada de (radio x radio + altura x altura)
    // Volumen: pi x radio x radio x altura)/3
    public static double areaCono(float radio, float altura) {
        double areaCirculo = areaCirculo(radio);
        double areaTriangulo = Math.PI * radio * (Math.sqrt((radio * radio) + (altura * altura)));
        return areaCirculo + areaTriangulo;
    }

    public static double volumenCono(float radio, float altura) {
        return (Math.PI * (radio * radio) * altura) / 3;
    }
}

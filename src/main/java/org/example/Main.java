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
        float perimetro = lado * 4;
        return perimetro;
    }

    public static float areaCuadrado(float lado) {
        float area = lado * lado;
        return area;
    }

    //Rectángulo:
    // Perimetro: (base x 2) + (altura x 2)
    // Area: base x altura
    public static float perimetroRectangulo(float base, float altura) {
        float perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

    public static float areaRectangulo(float base, float altura) {
        float area = base * altura;
        return area;
    }

    //Círculo:
    // Perimetro: 2 x pi x radio
    // Area: pi x radio x radio
    public static double perimetroCirculo(float radio) {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    public static double areaCirculo(float radio) {
        double area = Math.PI * radio * radio;
        return area;
    }

    //Esfera:
    // Area: 4 x pi x radio x radio
    // Volumen: (4/3) x pi x radio x radio x radio
    public static double areaEsfera(float radio) {
        double area = 4 * areaCirculo(radio);
        return area;
    }

    public static double volumenEsfera(float radio) {
        double volumen = (4 / 3) * Math.PI * radio * radio * radio;
        return volumen;
    }

    //Cubo:
    // Perimetro: 12 x lado
    // Volumen: lado x lado x lado
    // Area: 6 x lado x lado
    public static float perimetroCubo(float lado) {
        float perimetro = 3 * perimetroCuadrado(lado);
        return perimetro;
    }

    public static float areaCubo(float lado) {
        float area = 6 * areaCuadrado(lado);
        return area;
    }

    public static float volumenCubo(float lado) {
        float volumen = areaCuadrado(lado) * lado;
        return volumen;
    }

    //Cono:
    // Area: pi x radio x radio + raiz cuadrada de (radio x radio + altura x altura)
    // Volumen: pi x radio x radio x altura)/3
    public static double areaCono(float radio, float altura) {
        double areaCirculo = areaCirculo(radio);
        double areaTriangulo = Math.PI * radio * (Math.sqrt((radio * radio) + (altura * altura)));
        double areaTotal = areaCirculo + areaTriangulo;
        return areaTotal;
    }

    public static double volumenCono(float radio, float altura) {
        double volumen = (Math.PI * (radio * radio) * altura) / 3;
        return volumen;
    }
}

package org.example;

public class Main {

// Actividad 1

//Funcion para determinar el mayor entre 2 numeros

    public static double numeroMayor(double numero1, double numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else if (numero2 > numero1) {
            return numero2;
        } else if (numero1 == numero2) {
            return numero1;
        } else {
            return 0;
        }
    }

//Funcion para encontrar el menor de 2 numeros

    public static double numeroMenor(double numero1, double numero2) {
        if (numero1 < numero2) {
            return numero1;
        } else if (numero2 < numero1) {
            return numero2;
        } else if (numero1 == numero2) {
            return numero1;
        } else {
            return 0;
        }
    }

//Funcion para elevar un numero al otro (solo enteros)

    public static double elevarAPotencia (int base, int exponente){
        if (exponente == 0){
            return 1;
        }
        double resultado = 1;

        if (exponente > 0){
            for (int potencia = 1; potencia <= exponente; potencia++){
                resultado *= base;
            }
        } else if (exponente < 0) {
            for (int potencia = 1; potencia <= -exponente; potencia++){
                resultado /= base;
            }
        }
        return resultado;
    }

//Funcion para calcular el porcentaje de un numero

    public static double porcentajeDeNumero (double numero, double porcentaje){
        return numero * porcentaje/100;
    }

}
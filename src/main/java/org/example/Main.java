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

}
package org.example;

public class Main {

// Actividad 1

//Funcion para determinar el mayor entre 2 numeros

    public static double numeroMayor(double numero1, double numero2) {
        double mayor = 0;
        if (numero1 > numero2) {
            mayor = numero1;
            return mayor;
        } else if (numero2 > numero1) {
            mayor = numero2;
            return mayor;
        } else if (numero1 == numero2) {
            mayor = numero2;
            return mayor;
        } else {
            return mayor;
        }
    }

//Funcion para encontrar el menor de 2 numeros

    public static double numeroMenor(double numero1, double numero2) {
        double menor = 0;
        if (numero1 < numero2) {
            menor = numero1;
            return menor;
        } else if (numero2 < numero1) {
            menor = numero2;
            return menor;
        } else if (numero1 == numero2) {
            menor = numero2;
            return menor;
        } else {
            return menor;
        }
    }

}
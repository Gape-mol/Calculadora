package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void menu() {
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            continuar = accionesMenu(verificarEntero());
        }
    }

    public static void mostrarMenu() {
        System.out.println("------------------ Menu Principal ------------------");
        System.out.println("1. Operaciones con 2 numeros");
        System.out.println("2. Operaciones de Funciones y Ecuaciones");
        System.out.println("3. Encontrar Volumen, Area o Perimetro");
        System.out.println("4. Salir");
    }

    public static boolean accionesMenu(int seleccion){
        switch (seleccion) {
            case 1:
                subMenu1();
                return true;
            case 2:
                subMenu2();
                return true;
            case 3:
                //subMenu3();
                return true;
            case 4:
                return false;
            default:
                return true;

        }
    }

   // public static void subMenu3(){
   //     boolean continuar = true;
   //     while (continuar) {
   //         mostrarSubMenu3();
   //         subMenu3();
   //     }
   // }

    //public static void mostrarSubMenu3(){

    //}

    public static void subMenu2(){
        boolean continuar = true;
        while (continuar) {
            mostrarSubMenu2();
            continuar = accionesSubMenu2(verificarEntero());
        }
    }

    public static void mostrarSubMenu2(){
        System.out.println("--------------- Menu Operaciones de Funciones y Ecuaciones ---------------");
        System.out.println("1. Soluciones de una ecuacion cuadratica");
        System.out.println("2. Calcular solucion de un sistema de ecuaciones");
        System.out.println("3. Calcular la funcion de una recta con 2 puntos");
        System.out.println("4. Salir");
    }

    public static boolean accionesSubMenu2(int seleccion){
        switch (seleccion) {
            case 1:
                //calculadorSolucionesCuadratica();
                return true;
            case 2:
                //resolverEcuaciones();
                return true;
            case 3:
                System.out.println("En el punto inicial:");
                System.out.print("El valor de X: ");
                int x1 = verificarEntero();
                System.out.print("El valor de Y: ");
                int y1 = verificarEntero();
                System.out.println("En el punto final: ");
                System.out.print("El valor de X: ");
                int x2 = verificarEntero();
                System.out.print("El valor de Y: ");
                int y2 = verificarEntero();
                //String recta = calculo(x1, x2, y1, y2);
                //System.out.println("La ecuación de la recta es: " + recta);
                return true;
            case 4:
                return false;
            default:
                System.out.println("Opcion no valida");
                return true;
        }
    }



    public static void subMenu1() {
        boolean continuar = true;
        while (continuar) {
            mostrarSubMenu1();
            continuar = accionesSubMenu1(verificarEntero());
        }
    }

    public static void mostrarSubMenu1() {
        System.out.println("--------------- Menu Operaciones con 2 numeros ----------------");
        System.out.println("1. Encontrar el mayor");
        System.out.println("2. Encontrar el menor ");
        System.out.println("3. Elevar un numero a otro ");
        System.out.println("4. Porcentaje de un numero");
        System.out.println("5. Salir");
    }

    public static boolean accionesSubMenu1(int seleccion) {
        double numeroDecimal1;
        double numeroDecimal2;
        int numeroEntero1;
        int numeroEntero2;
        switch (seleccion) {
            case 1:
                System.out.print("Ingrese el primer numero: ");
                numeroDecimal1 = verificarDouble();
                System.out.print("Ingrese el segundo numero: ");
                numeroDecimal2 = verificarDouble();
                System.out.println("El numero mayor es: " + numeroMayor(numeroDecimal1, numeroDecimal2));
                return true;
            case 2:
                System.out.print("Ingrese el primer numero: ");
                numeroDecimal1 = verificarDouble();
                System.out.print("Ingrese el segundo numero: ");
                numeroDecimal2 = verificarDouble();
                System.out.println("El numero menor es: " + numeroMenor(numeroDecimal1, numeroDecimal2));
                return true;
            case 3:
                System.out.print("Ingrese la base: ");
                numeroEntero1 = verificarEntero();
                System.out.print("Ingrese el exponente: ");
                numeroEntero2 = verificarEntero();
                System.out.println("El resultado es: " + elevarAPotencia(numeroEntero1, numeroEntero2));
            case 4:
                System.out.print("Ingrese el numero: ");
                numeroDecimal1 = verificarDouble();
                System.out.print("Ingrese el porcentaje que quiere saber del numero: ");
                numeroDecimal2 = verificarDouble();
                System.out.println("El resultado es: "+ porcentajeDeNumero(numeroDecimal1, numeroDecimal2));
                return true;
            case 5:
                return false;
            default:
                System.out.println("Opcion no valida");
                return true;
        }
    }



    public static double verificarDouble(){
        double decimal;
        try{
            decimal = obtenerDouble();
        } catch (InputMismatchException e) {
            decimal = 0;
        }
        return decimal;
    }

    public static int verificarEntero() {
        int entero;
        try{
            entero = obtenerEntero();
        } catch (InputMismatchException e) {
            entero = 0;
        }
        return entero;
    }

    public static double obtenerDouble(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextDouble();
    }

    public static int obtenerEntero(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

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
        } else {
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
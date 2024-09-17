

package org.example;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        menu();
    }

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
                calculadorSolucionesCuadratica();
                return true;
            case 2:
                resolverEcuaciones();
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
                String recta = calculo(x1, x2, y1, y2);
                System.out.println("La ecuación de la recta es: " + recta);
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
  
   public static String calculo(int x1, int x2, int y1, int y2) {
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



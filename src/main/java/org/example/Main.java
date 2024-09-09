package org.example;

public class Main {

// Ax + By = C
// Dx + Ey = F

    public static String resolverSistemaEcuaciones(double numeroA, double numeroB, double numeroC,
                                                   double numeroD, double numeroE, double numeroF) {
        double [][] sistemaEcuaciones = new double[2][3];

        sistemaEcuaciones[0][0] = numeroA;
        sistemaEcuaciones[0][1] = numeroB;
        sistemaEcuaciones[0][2] = numeroC;
        sistemaEcuaciones[1][0] = numeroD;
        sistemaEcuaciones[1][1] = numeroE;
        sistemaEcuaciones[1][2] = numeroF;


    }
}
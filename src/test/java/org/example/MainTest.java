package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testSolucionUnica() {
        assertEquals(-1,Main.calcularSolucionUnica(1,2));
    }

    @Test
    public void testSolucionUnica2() {
        assertEquals(-1,Main.calcularSolucionUnica(2,4));
    }

    @Test
    public void testCalcularDiscriminante() {
        assertEquals(1, Main.calcularDiscriminante(2,9,10));
    }

    @Test
    public void testCalcularDiscriminante2() {
        assertEquals(16, Main.calcularDiscriminante(1,8,12));
    }

    @Test
    public void testPrimeraSolucion() {
        assertEquals(-2,Main.calcularPrimeraSolucion(2,9,1));
    }

    @Test
    public void testPrimeraSolucion2() {
        assertEquals(-2,Main.calcularPrimeraSolucion(1,8,16));
    }

    @Test
    public void testSegundaSolucion() {
        assertEquals(-2.5,Main.calcularSegundaSolucion(2,9,1));
    }

    @Test
    public void testSegundaSolucion2() {
        assertEquals(-6,Main.calcularSegundaSolucion(1,8,16));
    }

    @Test
    public void testSolucionSistema() {
        double[] resultado = Main.resolverSistema(1,2,3,4,5,6);
        assertEquals(-1.0, resultado[0], "x es -1");
        assertEquals(2.0, resultado[1], "y es 2");
    }

    @Test
    public void testSolucionSistema2() {
        double[] resultado = Main.resolverSistema(2,1,3,4,5,6);
        assertEquals(1.5, resultado[0], "x es 1.5");
        assertEquals(-0.0, resultado[1], "y es 0");
    }
}
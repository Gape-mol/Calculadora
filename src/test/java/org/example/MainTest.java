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
}
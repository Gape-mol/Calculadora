package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void numeroMayor() {
        assertEquals(3.14, Main.numeroMayor(3.14, 1));

        assertEquals(-1 , Main.numeroMayor(-4, -1));

        assertEquals(10, Main.numeroMayor(10, 10));
    }

    @Test
    void numeroMenor() {
        assertEquals(1, Main.numeroMenor(3.14, 1));

        assertEquals(-4 , Main.numeroMenor(-4, -1));

        assertEquals(10, Main.numeroMenor(10, 10));
    }

    @Test
    void elevarAExponente() {
        assertEquals(8, Main.elevarAPotencia(2,3));

        assertEquals(0.5, Main.elevarAPotencia(2, -1));

        assertEquals(1, Main.elevarAPotencia(0, 0));
    }

    @Test
    void porcentajeDeNumero() {
        assertEquals(50, Main.porcentajeDeNumero(100, 50));

        assertEquals(1.5, Main.porcentajeDeNumero(1, 150));

        assertEquals(0 , Main.porcentajeDeNumero(1289401.98, 0));
    }

}
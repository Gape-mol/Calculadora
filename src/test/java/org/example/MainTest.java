package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();

    @Test
    void perimetroCuadrado() {
        //Lado negativo
        assertEquals(0, main.perimetroCuadrado(-1));
        //Lado 0
        assertEquals(0, main.perimetroCuadrado(0));
        //Lado int
        assertEquals(8, main.perimetroCuadrado(2));
        //Lado float
        assertEquals(12.4, main.perimetroCuadrado(3.1F) , 0.1);
    }
    @Test
    void areaCuadrado() {
        //Lado negativo
        assertEquals(0, main.areaCuadrado(-1));
        //Lado 0
        assertEquals(0, main.areaCuadrado(0));
        //Lado int
        assertEquals(4, main.areaCuadrado(2));
        //Lado float
        assertEquals(9.61, main.areaCuadrado(3.1F) , 0.1);
    }
}
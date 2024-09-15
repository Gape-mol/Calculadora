package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void perimetroCuadrado() {
        //Lado negativo
        assertEquals(0, Main.perimetroCuadrado(-1));
        //Lado 0
        assertEquals(0, Main.perimetroCuadrado(0));
        //Lado int
        assertEquals(8, Main.perimetroCuadrado(2));
        //Lado float
        assertEquals(12.4, Main.perimetroCuadrado(3.1F) , 0.1);
    }
    @Test
    void areaCuadrado() {
        //Lado negativo
        assertEquals(0, Main.areaCuadrado(-1));
        //Lado 0
        assertEquals(0, Main.areaCuadrado(0));
        //Lado int
        assertEquals(4, Main.areaCuadrado(2));
        //Lado float
        assertEquals(9.61, Main.areaCuadrado(3.1F) , 0.1);
    }

    @Test
    void perimetroRectangulo() {
        //Base negativa
        assertEquals(0, Main.perimetroRectangulo(-1, 2));
        //Altura negativa
        assertEquals(0, Main.perimetroRectangulo(2, -1));
        //Base 0
        assertEquals(0, Main.perimetroRectangulo(0, 2));
        //Altura 0
        assertEquals(0, Main.perimetroRectangulo(2, 0));
        //Ambos int
        assertEquals(10, Main.perimetroRectangulo(3, 2));
        //Ambos float
        assertEquals(10.2, Main.perimetroRectangulo(3.1F, 2.0F), 0.1);
    }

    @Test
    void areaRectangulo() {
        //Base negativa
        assertEquals(0, Main.areaRectangulo(-1, 2));
        //Altura negativa
        assertEquals(0, Main.areaRectangulo(2, -1));
        //Base 0
        assertEquals(0, Main.areaRectangulo(0, 2));
        //Altura 0
        assertEquals(0, Main.areaRectangulo(2, 0));
        //Ambos int
        assertEquals(6, Main.areaRectangulo(3, 2));
        //Ambos float
        assertEquals(6.2, Main.areaRectangulo(3.1F, 2.0F), 0.1);
    }

    @Test
    void perimetroCirculo() {
        //Radio negativo
        assertEquals(0, Main.perimetroCirculo(-1));
        //Radio 0
        assertEquals(0, Main.perimetroCirculo(0));
        //Radio int
        assertEquals(6.2, Main.perimetroCirculo(1), 0.1);
        //Radio float
        assertEquals(9.4, Main.perimetroCirculo(1.5F), 0.1);
    }

    @Test
    void areaCirculo() {
        //Radio negativo
        assertEquals(0, Main.areaCirculo(-1));
        //Radio 0
        assertEquals(0, Main.areaCirculo(0));
        //Radio int
        assertEquals(3.1, Main.areaCirculo(1), 0.1);
        //Radio float
        assertEquals(7.1, Main.areaCirculo(1.5F), 0.1);
    }

    @Test
    void areaEsfera() {
        //Radio negativo
        assertEquals(0, Main.areaEsfera(-1));
        //Radio 0
        assertEquals(0, Main.areaEsfera(0));
        //Radio int
        assertEquals(12.5, Main.areaEsfera(1), 0.1);
        //Radio float
        assertEquals(28.2, Main.areaEsfera(1.5F), 0.1);
    }

    @Test
    void volumenEsfera() {
        //Radio negativo
        assertEquals(0, Main.volumenEsfera(-1));
        //Radio 0
        assertEquals(0, Main.volumenEsfera(0));
        //Radio int
        assertEquals(4.2, Main.volumenEsfera(1), 0.1);
        //Radio float
        assertEquals(14.1, Main.volumenEsfera(1.5F), 0.1);
    }

    @Test
    void perimetroCubo() {
        //Lado negativo
        assertEquals(0, Main.perimetroCubo(-1));
        //Lado 0
        assertEquals(0, Main.perimetroCubo(0));
        //Lado int
        assertEquals(24, Main.perimetroCubo(2));
        //Lado float
        assertEquals(18.6, Main.perimetroCubo(3.1F), 0.1);
    }

    @Test
    void areaCubo() {
        //Lado negativo
        assertEquals(0, Main.areaCubo(-1));
        //Lado 0
        assertEquals(0, Main.areaCubo(0));
        //Lado int
        assertEquals(24, Main.areaCubo(2));
        //Lado float
        assertEquals(54.6, Main.areaCubo(3.1F), 0.5);
    }

    @Test
    void volumenCubo() {
        //Lado negativo
        assertEquals(0, Main.volumenCubo(-1));
        //Lado 0
        assertEquals(0, Main.volumenCubo(0));
        //Lado int
        assertEquals(8, Main.volumenCubo(2));
        //Lado float
        assertEquals(27.1, Main.volumenCubo(3.1F), 0.1);
    }

    @Test
    void areaCono() {
        //Radio negativo
        assertEquals(0, Main.areaCono(-1, 2));
        //Altura negativa
        assertEquals(0, Main.areaCono(2, -1));
        //Radio 0
        assertEquals(0, Main.areaCono(0, 2));
        //Altura 0
        assertEquals(0, Main.areaCono(2, 0));
        //Ambos int
        assertEquals(12.6, Main.areaCono(1, 3), 0.5);
        //Ambos float
        assertEquals(19.6, Main.areaCono(1.5F, 3.1F), 0.5);
    }

    @Test
    void volumenCono() {
        //Radio negativo
        assertEquals(0, Main.volumenCono(-1, 2));
        //Altura negativa
        assertEquals(0, Main.volumenCono(2, -1));
        //Radio 0
        assertEquals(0, Main.volumenCono(0, 2));
        //Altura 0
        assertEquals(0, Main.volumenCono(2, 0));
        //Ambos int
        assertEquals(1, Main.volumenCono(1, 3), 0.1);
        //Ambos float
        assertEquals(4.7, Main.volumenCono(1.5F, 3.1F), 0.1);
    }

}
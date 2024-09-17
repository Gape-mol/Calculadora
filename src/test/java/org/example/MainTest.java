package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;


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
  
   void perimetroCuadrado() {
        assertEquals(0, Main.perimetroCuadrado(-1), 0.1);
        assertEquals(0, Main.perimetroCuadrado(0), 0.1);
        assertEquals(8, Main.perimetroCuadrado(2), 0.1);
        assertEquals(12.4, Main.perimetroCuadrado(3.1), 0.1);
    }

    @Test
    void areaCuadrado() {
        assertEquals(0, Main.areaCuadrado(-1), 0.1);
        assertEquals(0, Main.areaCuadrado(0), 0.1);
        assertEquals(4, Main.areaCuadrado(2), 0.1);
        assertEquals(9.6, Main.areaCuadrado(3.1), 0.1);
    }

    @Test
    void perimetroRectangulo() {
        assertEquals(0, Main.perimetroRectangulo(-1, 2), 0.1);
        assertEquals(0, Main.perimetroRectangulo(2, -1), 0.1);
        assertEquals(0, Main.perimetroRectangulo(0, 2), 0.1);
        assertEquals(0, Main.perimetroRectangulo(2, 0), 0.1);
        assertEquals(10, Main.perimetroRectangulo(3, 2), 0.1);
        assertEquals(10.2, Main.perimetroRectangulo(3.1, 2.0), 0.1);
    }

    @Test
    void areaRectangulo() {
        assertEquals(0, Main.areaRectangulo(-1, 2), 0.1);
        assertEquals(0, Main.areaRectangulo(2, -1), 0.1);
        assertEquals(0, Main.areaRectangulo(0, 2), 0.1);
        assertEquals(0, Main.areaRectangulo(2, 0), 0.1);
        assertEquals(6, Main.areaRectangulo(3, 2), 0.1);
        assertEquals(6.2, Main.areaRectangulo(3.1, 2.0), 0.1);
    }

    @Test
    void perimetroCirculo() {
        assertEquals(0, Main.perimetroCirculo(-1), 0.1);
        assertEquals(0, Main.perimetroCirculo(0), 0.1);
        assertEquals(6.3, Main.perimetroCirculo(1), 0.1);
        assertEquals(9.4, Main.perimetroCirculo(1.5), 0.1);
    }

    @Test
    void areaCirculo() {
        assertEquals(0, Main.areaCirculo(-1), 0.1);
        assertEquals(0, Main.areaCirculo(0), 0.1);
        assertEquals(3.1, Main.areaCirculo(1), 0.1);
        assertEquals(7.1, Main.areaCirculo(1.5), 0.1);
    }

    @Test
    void areaEsfera() {
        assertEquals(0, Main.areaEsfera(-1), 0.1);
        assertEquals(0, Main.areaEsfera(0), 0.1);
        assertEquals(12.6, Main.areaEsfera(1), 0.1);
        assertEquals(28.3, Main.areaEsfera(1.5), 0.1);
    }

    @Test
    void volumenEsfera() {
        assertEquals(0, Main.volumenEsfera(-1), 0.1);
        assertEquals(0, Main.volumenEsfera(0), 0.1);
        assertEquals(4.2, Main.volumenEsfera(1), 0.1);
        assertEquals(14.1, Main.volumenEsfera(1.5), 0.1);
    }

    @Test
    void perimetroCubo() {
        assertEquals(0, Main.perimetroCubo(-1), 0.1);
        assertEquals(0, Main.perimetroCubo(0), 0.1);
        assertEquals(24, Main.perimetroCubo(2), 0.1);
        assertEquals(37.2, Main.perimetroCubo(3.1), 0.1);
    }

    @Test
    void areaCubo() {
        assertEquals(0, Main.areaCubo(-1), 0.1);
        assertEquals(0, Main.areaCubo(0), 0.1);
        assertEquals(24, Main.areaCubo(2), 0.1);
        assertEquals(57.6, Main.areaCubo(3.1), 0.1);
    }

    @Test
    void volumenCubo() {
        assertEquals(0, Main.volumenCubo(-1), 0.1);
        assertEquals(0, Main.volumenCubo(0), 0.1);
        assertEquals(8, Main.volumenCubo(2), 0.1);
        assertEquals(29.8, Main.volumenCubo(3.1), 0.1);
    }

    @Test
    void areaCono() {
        assertEquals(0, Main.areaCono(-1, 2), 0.1);
        assertEquals(0, Main.areaCono(2, -1), 0.1);
        assertEquals(0, Main.areaCono(0, 2), 0.1);
        assertEquals(0, Main.areaCono(2, 0), 0.1);
        assertEquals(13.1, Main.areaCono(1, 3), 0.1);
        assertEquals(23.3, Main.areaCono(1.5, 3.1), 0.1);
    }

    @Test
    void volumenCono() {
        assertEquals(0, Main.volumenCono(-1, 2), 0.1);
        assertEquals(0, Main.volumenCono(2, -1), 0.1);
        assertEquals(0, Main.volumenCono(0, 2), 0.1);
        assertEquals(0, Main.volumenCono(2, 0), 0.1);
        assertEquals(3.1, Main.volumenCono(1, 3), 0.1);
        assertEquals(7.1, Main.volumenCono(1.5, 3.1), 0.3);
    }
}



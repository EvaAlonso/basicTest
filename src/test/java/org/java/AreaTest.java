package org.java;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaTest {
    @Test
    public void areaRectangulo_numerosEnteros_retornaAreaCorrecta(){
        Area area = new Area();
        float resultado = area.areaRectangulo(5, 10);
        float expResultado = 50;
        assertEquals(expResultado, resultado);
    }
    @Test
    public void areaCirculo_numerosEnteros_retornaAreaCorrecta(){
        Area area = new Area();
        double resultado = area.areaCirculo(10);
        double expResultado = 314;
        assertEquals(expResultado, resultado);
    }
    @Test
    public void areaTriangulo_numerosEnteros_retornaAreaCorrecta(){
        Area area = new Area();
        float resultado = area.areaTriangulo(10, 4);
        float expResultado = 20;
        assertEquals(expResultado, resultado);
    }
    @Test
    public void areaPentagono_numerosEnteros_retornaAreaCorrecta(){
        Area area = new Area();
        double resultado = area.areaPentagono(6, 4.1 );
        double expResultado = 61;
        assertEquals(expResultado, resultado);
    }
}
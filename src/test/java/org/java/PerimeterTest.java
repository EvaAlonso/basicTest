package org.java;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerimeterTest {

    @Test
    public void rectangle_perimeterCalc_returnTest() {

        // Preparación
        Perimeter perimeter = new Perimeter();

        // Ejecución
        float result = perimeter.perimeterRectangle(10, 5);

        // Verificación
        float expRes = 30;
        assertEquals(expRes, result);

    }

    @Test
    public void circle_perimeterCalc_returnTest() {

        // Preparación
        Perimeter perimeter = new Perimeter();

        // Ejecución
        float result = perimeter.perimeterCircle(2);

        // Verificación
        float expRes = 12.56F;
        assertEquals(expRes, result);

    }

    @Test
    public void triangle_perimeterCalc_returnTest() {

        // Preparación
        Perimeter perimeter = new Perimeter();

        // Ejecución
        float result = perimeter.perimeterTriangle(7);

        // Verificación
        float expRes = 21;
        assertEquals(expRes, result);

    }

    @Test
    public void pentagon_perimeterCalc_returnTest() {

        // Preparación
        Perimeter perimeter = new Perimeter();

        // Ejecución
        float result = perimeter.perimeterPentagon(4);

        // Verificación
        float expRes = 20;
        assertEquals(expRes, result);

    }

}
package org.java;

public class Perimeter {

    public float perimeterRectangle( float base, float height ) {

        return ((base * 2) + (height * 2));

    }

    public float perimeterCircle( float radius ) {

       float pi = 3.14F;

       return 2 * pi * radius;

    }

    public float perimeterTriangle ( float side ) {

        // EQUILATERAL TRIANGLE
        return side * 3;

    }

    public float perimeterPentagon( float side ) {

        return side * 5;

    }

}

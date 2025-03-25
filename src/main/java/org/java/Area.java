package org.java;

import static java.lang.Math.round;

public class Area {
    public float areaRectangulo(float base, float altura){
        return base  * altura;
    }
    public double areaCirculo(double radio){
        double pi = 3.14;
        return pi * radio * radio;
    }
    public float areaTriangulo( float base, float altura){
        return ((base * altura)/2);
    }
    public double areaPentagono(double lado, double apotema){
        double perimetro = lado * 5;
        return Math.round((perimetro * apotema)/2);
    }
}

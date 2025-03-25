package org.java;

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
    public float areaPentagono(float lado, float apotema){
        float perimetro = lado + 5;
        return (perimetro * apotema)/2;
    }
}

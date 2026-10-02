package com.example.arquitecturagregoryjimenez;

public class Triangulo extends Figura {

    // Triangulo equilatero: los tres lados son iguales
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 3;
    }
}

package com.example.arquitecturagregoryjimenez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ArquitecturaGregoryJimenezApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArquitecturaGregoryJimenezApplication.class, args);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Calculo de area y perimetro de figuras");

        // CUADRADO
        System.out.println();
        System.out.println(" CUADRADO ");
        System.out.print("Ingrese el lado: ");
        double lado = scanner.nextDouble();

        Cuadrado cuadrado = new Cuadrado(lado);

        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro());

        // CIRCULO
        System.out.println();
        System.out.println(" CIRCULO ");
        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo(radio);

        System.out.println("El area del circulo es: " + circulo.calcularArea());
        System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());

        // TRIANGULO
        System.out.println();
        System.out.println(" TRIANGULO EQUILATERO ");
        System.out.print("Ingrese el lado: ");
        double ladoTriangulo = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(ladoTriangulo);

        System.out.println("El area del triangulo es: " + triangulo.calcularArea());
        System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro());

        scanner.close();
    }

}

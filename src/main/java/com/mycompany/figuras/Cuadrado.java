/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

public class Cuadrado extends Rectangulo {
     int lado;

    public Cuadrado(Punto esquina, int lado) {
        super(esquina, lado, lado); // un cuadrado es un rectángulo con lados iguales
        this.lado = lado;
    }

    @Override
    public void imprimir() {
        System.out.println("Cuadrado con esquina en:");
        super.esquina.imprimir();
        System.out.println("Lado = " + lado);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

public class Rectangulo {
     Punto esquina;
     int lado1;
     int lado2;

    public Rectangulo(Punto esquina, int lado1, int lado2) {
        this.esquina = esquina;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void imprimir() {
        System.out.println("Rectangulo con esquina en:");
        esquina.imprimir();
        System.out.println("Lado1 = " + lado1 + ", Lado2 = " + lado2);
    }
}


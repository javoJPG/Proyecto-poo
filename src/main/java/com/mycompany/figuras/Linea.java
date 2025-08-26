/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

public class Linea {
     Punto punto1;
     Punto punto2;

    public Linea(Punto p1, Punto p2) {
        this.punto1 = p1;
        this.punto2 = p2;
    }

    public void imprimir() {
        System.out.print("Linea formada por: ");
        punto1.imprimir();
        punto2.imprimir();
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

public class Circulo {
     Punto esquina;
     int radio;

    public Circulo(Punto esquina, int radio) {
        this.esquina = esquina;
        this.radio = radio;
    }

    public void imprimir() {
        System.out.println("Círculo con centro en:");
        esquina.imprimir();
        System.out.println("Radio = " + radio);
    }
}


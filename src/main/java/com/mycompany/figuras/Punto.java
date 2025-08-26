/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author johan
 */
public class Punto {
     int cordX;
     int cordY;

    public Punto(int x, int y) {
        this.cordX = x;
        this.cordY = y;
    }

    public void imprimir() {
        System.out.println("Punto en (" + cordX + ", " + cordY + ")");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

public class Punto3D extends Punto {
     int cordZ;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.cordZ = z;
    }

    @Override
    public void imprimir() {
        System.out.println("Punto3D en (" + cordX + ", " + cordY + ", " + cordZ + ")");
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras;

/**
 *
 * @author johan
 */
public class Figuras {

    public static void main(String[] args) {
        Punto p1 = new Punto(2, 3);
        Punto3D p3d = new Punto3D(1, 2, 5);

        Linea linea = new Linea(new Punto(0,0), new Punto(5,5));
        Rectangulo rect = new Rectangulo(new Punto(1,1), 4, 6);
        Cuadrado cuad = new Cuadrado(new Punto(2,2), 5);
        Circulo circ = new Circulo(new Punto(3,3), 7);

        p1.imprimir();
        p3d.imprimir();
        linea.imprimir();
        rect.imprimir();
        cuad.imprimir();
        circ.imprimir();
    }
}

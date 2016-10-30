/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Computadora extends Producto {

    public Computadora(double precio) {
        super(precio);
    }

    @Override
    public void info() {
        System.out.println(
                "Producto: Imac i7 Pro"+
                "Precio: " + getPrecio());
    }

}

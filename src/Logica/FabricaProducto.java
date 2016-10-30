/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

public interface FabricaProducto {
    
    Producto crearProducto(double precio, int opcion);
    
    double precioTotal();
}

package ecommerce;

import Logica.*;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class ECommerce {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int stock = 0;
        int opcion;
        int disponibles;

        System.out.println("¿Cuantos productos quiere comprar? How many items you wish?");
        disponibles = entrada.nextInt();
        Producto[] producto = new Producto[disponibles];
        Comercio comercio = new Comercio();

        do {

            System.out.println("1. Comprar Laptop / Buy Laptop "
                    + "\n2. Comprar Router / Buy Router"
                    + "\n3. Comprar Computadora / Buy Computer "
                    + "\n4. Verificar Compra / Confirm Shopping");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    producto[stock] = comercio.crearProducto(2000, opcion);
                    stock++;
                    break;
                case 2:
                    producto[stock] = comercio.crearProducto(500, opcion);
                    stock++;
                    break;
                case 3:
                    producto[stock] = comercio.crearProducto(7000, opcion);
                    stock++;
                    break;
            }
        } while (opcion != 4);

        for (int i = 0; i < producto.length; i++) {
            producto[i].info();
        }
        System.out.println("Factura Total: " + comercio.precioTotal());
    }

}

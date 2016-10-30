
package Logica;

public class Router extends Producto{

    public Router(double precio) {
        super(precio);
    }

    @Override
    public void info() {
        System.out.println(
                "Producto: Router TP-LINK"+
                "Precio: "+getPrecio());
    }
    
}

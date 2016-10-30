package Logica;

public class Comercio implements FabricaProducto{
    
    Facturacion factura = new Facturacion();
    
    @Override
    public Producto crearProducto(double precio, int opcion) {
        
        if(opcion == 1){
            factura.addPrecioTotal(precio);
            System.out.println("Usted ha añadido una Laptop a su carrito de compras!");
            return new Laptop(precio);
        }else if(opcion == 2){
            factura.addPrecioTotal(precio);
            System.out.println("Usted ha añadido una Router a su carrito de compras!");
            return new Router(precio);
        }else if(opcion == 3){
            factura.addPrecioTotal(precio);
  
            System.out.println("Usted ha añadido una Computadora a su carrito de compras!");
            return new Computadora(precio);
        }else if(opcion == 4){
            System.out.println("Gracias por su Visita!");
        }
        return null;
    }

    @Override
    public double precioTotal() {
        return factura.getTotal();
    }
}

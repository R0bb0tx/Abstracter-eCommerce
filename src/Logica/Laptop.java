package Logica;

public class Laptop extends Producto{

    public Laptop(double precio) {
        super(precio);
    }

    @Override
    public void info() {
        System.out.println("Producto: ASUS-VM7"+
                          "Precio: "+getPrecio());
    }
    
}

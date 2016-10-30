package Logica;

public abstract class Producto {
    
    private double precio;
    
    public abstract void info();
    
    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }      
}

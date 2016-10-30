package Logica;

public class Facturacion {

    public double total;
    
    public double getTotal(){
        return total;
    }
    
    public void addPrecioTotal(double total){
        this.total += total;
    }
}
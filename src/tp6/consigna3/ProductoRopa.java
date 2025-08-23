package tp6.consigna3;


    public class ProductoRopa extends Empresa implements RopaTalle{
        private String talle;

    public ProductoRopa(String nombre, double precio, String talle ) {
        super(nombre, precio);
        this.talle = talle;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }


    @Override
    public String mostrarDetalle() {
        return "Ropa: " + nombre + " | Precio: $" + precio + " | Talle: " + talle;
    }


    @Override
    public String tallePrenda() {
        return "Talle de " + talle ;
    }
}

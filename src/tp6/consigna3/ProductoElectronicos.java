package tp6.consigna3;

public class ProductoElectronicos extends Empresa implements GestionElectronica {
 private String Garantia ;

        public ProductoElectronicos(String nombre, double precio, String garantia) {
            super(nombre, precio);
            this.Garantia = garantia;
        }

        @Override
        public double calcularPrecio() {
            return precio;
        }

        @Override
        public String mostrarDetalle() {
            return "Producto " + nombre + " | Precio $" + precio + " | Numero de Garantia: " + Garantia;
        }

    @Override
    public String Garantia() {
        return Garantia;
    }
}



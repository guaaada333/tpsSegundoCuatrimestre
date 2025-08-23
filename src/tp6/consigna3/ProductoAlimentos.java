package tp6.consigna3;

import java.time.LocalDate;

public class ProductoAlimentos extends Almacen implements AlimentoVenc   {
    private LocalDate Vencimiento ;

    public ProductoAlimentos(String nombre, double precio , LocalDate Vencimiento) {
        super(nombre, precio);
            this.Vencimiento =  Vencimiento;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrarDetalle() {
        return "Producto: " + nombre+ "| Precio $" + precio +"|  Fecha de Vencimiento: " + Vencimiento;
    }
//metodo propio de la subclase ProductoAlimentos
    @Override
        public Double FechaVencimiento() {
        return Double.valueOf("Fecha de vencimiento " + Vencimiento);
    }
    public boolean estaPorVencer() {
        return Vencimiento.isBefore(LocalDate.now().plusDays(7));
    }
}


package tp6.consigna3;

import java.time.LocalDate;

public class pruebaAlmacen {
    public static void main(String[] args) {
        //ALIMENTOS ALMACEN

        ProductoAlimentos Cereal = new ProductoAlimentos("Cereal", 1200, LocalDate.of(2025, 8, 25));
        ProductoAlimentos Leche = new ProductoAlimentos("Leche", 900, LocalDate.of(2025, 7, 8));
        ProductoAlimentos GalletasOreo = new ProductoAlimentos("Galletas Oreo", 1200, LocalDate.of(2025, 10, 1));
        ProductoAlimentos Arroz = new ProductoAlimentos("Arroz", 1200, LocalDate.of(2026, 1, 2));


        System.out.println(Cereal.mostrarDetalle());
        System.out.println(Leche.mostrarDetalle());
        System.out.println(GalletasOreo.mostrarDetalle());
        System.out.println(Arroz.mostrarDetalle());


        //ELECTRONICA ALMACEN
        ProductoElectronicos Mouse = new ProductoElectronicos("Mouse", 5000, "HKSO9FF");
        System.out.println(Mouse.mostrarDetalle());


        //ROPA ALMACEN
        ProductoRopa Remera = new ProductoRopa("Remera", 24.000, "M");
        ProductoRopa JeanTucci = new ProductoRopa("Jean Tucci", 128.000, "S");
        ProductoRopa Buzo = new ProductoRopa("Buzo black", 50.000, "XL");

        System.out.println(Remera.mostrarDetalle());
        System.out.println(JeanTucci.mostrarDetalle());
        System.out.println(Buzo.mostrarDetalle());

    }
}

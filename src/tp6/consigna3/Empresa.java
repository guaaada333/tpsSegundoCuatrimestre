package tp6.consigna3;

import java.util.ArrayList;
import java.util.List;

public abstract class Empresa{
    protected String nombre;
    protected double precio;
    protected static List<String> Almacen ;

    public Empresa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.Almacen= new ArrayList<>();
        Almacen.add(nombre + "$" + precio );
    }

    public double calcularPrecio() {
        return precio;
    }
    //metodos
    public abstract String mostrarDetalle();


    }



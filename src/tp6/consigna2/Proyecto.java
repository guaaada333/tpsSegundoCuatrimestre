package tp6.consigna2;

import java.util.ArrayList;
import java.util.List;

// Clase abstracta
    abstract class Proyecto {
    protected int fechaInicio;
    protected int fechaFin;
    protected String tarea ;
    protected List <String> informe ;
    protected String responsable;

    public Proyecto(int fechaInicio, int fechaFin, String responsable,String tarea) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.responsable = responsable;
        this.tarea = tarea;
        this.informe= new ArrayList<>();
        informe.add("El responsable : "+ responsable + " cumplio con "+ calcularTiempo()+ " horas");
    }

    public abstract int calcularTiempo() ;
    public abstract String obtenerInforme();

    public void mostrarInforme(){
        System.out.println("Encargado de la " + tarea + " es " + responsable);
        for(String lista :informe ){
            System.out.println(lista);
        }
        System.out.println("  " );

    }


}

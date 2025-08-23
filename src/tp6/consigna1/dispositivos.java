package tp6.consigna1;

import java.util.ArrayList;
import java.util.List;

public abstract class dispositivos{
    protected String nombre ;
    protected boolean estado ;
    protected List <String> historial ;

    public dispositivos(String nombre){
        this.nombre= nombre;
        this.estado= false ;
        this.historial= new ArrayList<>();
        historial.add("Dispositivo : "+ nombre + " esta apagado");

    }
    public abstract void encender();
    public abstract void apagar();
    public abstract String obtenerEstado();

    public void mostrarHistorial(){
        System.out.println("Historial del dispositivo :" + nombre);
        for(String lista :historial ){
            System.out.println(lista);
        }
    }

}
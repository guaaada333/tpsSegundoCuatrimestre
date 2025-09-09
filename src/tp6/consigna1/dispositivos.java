package tp6.consigna1;

import java.util.ArrayList;
import java.util.List;

public class dispositivos {
    protected String nombre;
    protected boolean estado;
    protected List<String> historial;

    public dispositivos(String nombre) {
        this.nombre = nombre;
        this.estado = false;
        this.historial = new ArrayList<>();
        historial.add("Dispositivo : " + nombre + " esta apagado");

    }

    public void apagar() {
        if (estado) {
            estado = false;
            historial.add("El elemento " + nombre + " se ha apagado");
        }
    }

    public void encender() {
        if (!estado) {
            estado = true;
            historial.add("El elemento " + nombre + " se ha encendido");
        }
    }

    public String obtenerEstado() {
        if (estado) {
            return "Encendido";

        } else {
            return "Apagado";

        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial del dispositivo :" + nombre);
        for (String lista : historial) {
            System.out.println(lista);
        }
    }
}


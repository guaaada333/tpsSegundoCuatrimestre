package tp6.consigna2;

public class TareaContaduria extends Proyecto {
    public TareaContaduria(int fechaInicio, int fechaFin, String responsable,String tarea) {
        super(fechaInicio, fechaFin, responsable,tarea);
    }
    @Override
    public int calcularTiempo() {
        return Math.abs(fechaFin - fechaInicio);
    }
    @Override
    public String obtenerInforme() {
        return "Tarea de contaduria realizada por " + responsable + "en " + calcularTiempo() + " horas";

    }
}
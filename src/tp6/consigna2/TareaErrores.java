package tp6.consigna2;

public class TareaErrores extends Proyecto {
    public TareaErrores(int fechaInicio, int fechaFin, String responsable,String tarea) {
        super(fechaInicio, fechaFin, responsable,tarea);
    }
    @Override
    public int calcularTiempo() {
        return Math.abs(fechaFin - fechaInicio);
    }
    @Override
    public String obtenerInforme() {
        return "Tarea de errores realizada por " + responsable + "en " + calcularTiempo() + " horas";


    }
}

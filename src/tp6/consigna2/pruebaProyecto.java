package tp6.consigna2;

public class pruebaProyecto {
    public static void main(String[] args) {
        TareaAdministrar t1 =new TareaAdministrar(10 , 23 ,"Marta diaz", "Tarea Administrar");
        TareaErrores t2 =new TareaErrores(1 , 23 ,"Enzo Lopez","Tarea Errores");
        TareaContaduria t3 =new TareaContaduria(23 , 28 ,"Roberto Villafañe", "Tarea Contaduria");

        System.out.println("=== Informe del Proyecto ===" );//Tarea1
        t1.calcularTiempo();
        t1.obtenerInforme();
        t1.mostrarInforme();



        t2.calcularTiempo();
        t2.obtenerInforme();
        t2.mostrarInforme();

        t3.calcularTiempo();
        t3.obtenerInforme();
        t3.mostrarInforme();



}
}
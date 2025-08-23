package tp6.consigna1;

public class camara extends dispositivos {
    public camara(String nombre){
        super(nombre);

    }

    @Override
    public void encender(){
        if(!estado){
            estado= true ;
            historial.add("La tp1.consigna1.camara se ha prendido ");
        }
    }

    @Override
    public void apagar(){
        if(estado){
            estado= false ;
            historial.add("La tp1.consigna1.camara se ha apagado");
        }
    }

    @Override
    public String obtenerEstado(){
        if(estado){
            return "Encendido";

        }else{
            return "Apagado";

        }
    }
}
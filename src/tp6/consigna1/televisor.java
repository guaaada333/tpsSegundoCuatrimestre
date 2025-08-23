package tp6.consigna1;

public class televisor extends dispositivos {
    public televisor(String nombre){
        super(nombre);

    }
    @Override
    public void encender(){
        if(!estado){
            estado= true ;
            historial.add("Televisor se ha encendido ");
        }
    }

    @Override
    public void apagar(){
        if(estado){
            estado= false ;
            historial.add("Televisor se ha apagado");
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

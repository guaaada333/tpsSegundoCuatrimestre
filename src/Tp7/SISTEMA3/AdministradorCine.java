package Tp7.SISTEMA3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AdministradorCine {
       private int capacidad;
       private int AsientoOcupados;
       private ArrayList<Asientos> asientos ;



       public AdministradorCine(int capacidad) {
           this.capacidad = capacidad;
           this.AsientoOcupados = 0;
           asientos  = new ArrayList<>();
           for (int i = 1; i <= capacidad; i++) {
               asientos.add(new Asientos (i));//numerados desde 1
           }
       }

       public void ocuparAsiento(int numero)throws RuntimeException{
       if(numero < 1 || numero > capacidad){
       throw new ReservaException("El asiento " + numero + " no existe" );

       }
           Asientos asiento = asientos.get(numero - 1); // porque el array empieza en 0
           asiento.ocupar();
           AsientoOcupados++;

       }
}
package Tp7.SISTEMA3;

import java.util.ArrayList;

public class Asientos {
    private boolean ocupado;
    private int numeroAsiento;

    public Asientos(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
        this.ocupado = false;//lo inicializo libre (false es que no esta ocupado y true es que esta ocupado)
    }


    public int getNumeroAsiento() {
        return numeroAsiento;

    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocupar() throws ReservaException {
        if (ocupado==true) {
            throw new ReservaException("Asiento " + numeroAsiento + " ya esta ocupado");
        }else {
            ocupado = true;
            System.out.println("Asiento " + numeroAsiento + " reservado exitosamente ");

        }

    }
}

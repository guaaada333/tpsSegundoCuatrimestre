package Tp7.SISTEMA3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AdministradorCine {
        private List<Boolean> asientos;
        private int capacidad;

        public AdministradorCine(int capacidad) {
            this.capacidad = capacidad;
            this.asientos = new ArrayList<>();
            for (int i = 0; i < capacidad; i++) {
                asientos.add(false); // todos libres
            }
        }

        public void reservar(int numeroAsiento) throws ReservaException {
            if (numeroAsiento < 0 || numeroAsiento >= capacidad) {
                throw new ReservaException(" El asiento " + numeroAsiento + " no existe.");
            }
            if (asientos.get(numeroAsiento)) {
                throw new ReservaException(" El asiento " + numeroAsiento + " ya está ocupado.");
            }
            if (!asientos.contains(false)) {
                throw new ReservaException(" La sala está completa, no hay más lugares.");
            }
            asientos.set(numeroAsiento, true);
            System.out.println("Asiento " + numeroAsiento + " reservado con éxito.");
        }

        public static void main(String[] args) {
            AdministradorCine sala = new AdministradorCine(5);

            try {
                sala.reservar(2);
                sala.reservar(2); // Ocupado
            } catch (ReservaException e) {
                System.out.println(e.getMessage());
            }

            try {
                sala.reservar(10); // Inválido
            } catch (ReservaException e) {
                System.out.println(e.getMessage());
            }

            try {
                sala.reservar(0);
                sala.reservar(1);
                sala.reservar(3);
                sala.reservar(4); // Último libre
                sala.reservar(0); // Sala llena
            } catch (ReservaException e) {
                System.out.println(e.getMessage());
            }
        }
    }



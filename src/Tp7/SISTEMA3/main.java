package Tp7.SISTEMA3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AdministradorCine cine = new AdministradorCine(5);
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduzca el numero de asiento que desea ocupar");
            int numero = sc.nextInt();

            try {
                cine.ocuparAsiento(numero);
            } catch (ReservaException e) {
                System.out.println("⚠ " + e.getMessage());
                i--;
            }
        }
        sc.close();

    }
}


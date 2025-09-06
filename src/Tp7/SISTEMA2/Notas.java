package Tp7.SISTEMA2;

import Tp7.SISTEMA1.ContrasenaInvalidaException;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);

        System.out.println("ingrese una nota: ");
        int nota = ingresar.nextInt();

            try{
                ValidarNota(nota);
            }catch(ContrasenaInvalidaException e){
                System.out.println(e.getMessage());
            }


    }


    public static void ValidarNota(int nota) throws CalificacionInvalida {
     if(nota == -0){
         throw new CalificacionInvalida("NOTA INVALIDA: -0 no es posible");
     }if(nota < 0 || nota > 10){
         throw new CalificacionInvalida("NOTA INVALIDA: no es posible un numero negativo o mayor a 10");
        }

    }
}
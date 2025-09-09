package Tp7.SISTEMA1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("ingrese la contraseña ");
        String password1 = ingresar.nextLine();

        try {
            ValidacionMetodo(password1);

        } catch (ContrasenaInvalidaException o) {
            System.out.println(o.getMessage());
        }
    }


    public static void ValidacionMetodo(String password1) throws ContrasenaInvalidaException {
        if (password1.isEmpty())
            throw new ContrasenaInvalidaException("ERROR Debe tener algun caracter");
        if (password1.length() < 8) {
            throw new ContrasenaInvalidaException("ERROR La contraseña debe tener 8 o mas caracteres");
        }if (!password1.matches(".*\\d.*")) {
            throw new ContrasenaInvalidaException("EROR Debe tener algun NUMERO");

        }if(!password1.matches(".*[A-Z].*")){
            throw new ContrasenaInvalidaException("EROR Debe tener alguna mayuscula");
        }


    }

}


package OperadoresVarios;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

//Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir.
        Scanner consola = new Scanner(System.in);

        System.out.println("Favor introduzca su nombre");
        String nombre = consola.nextLine();
        System.out.println("Bienvenida " + nombre);

    }
}

package EjerciciosCalentamiento;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

/*Dada una cadena de caracteres (String) de longitud desconocida que tiene solamente dígitos, crear un array de N
elementos (donde N es el tamaño de la cadena) que tenga cada uno de los valores numéricos de los dígitos.*/
        Scanner consola = new Scanner(System.in);
        System.out.println("Favor ingresar digitos");
        String cadena = consola.nextLine();
        cadena = cadena.toUpperCase();

        String[] array = new String[cadena.length()];
        char[] nros = cadena.toCharArray();

        for(int i = 0; i < nros.length; i++) {
            System.out.print(nros[i] + "," );
        }
    }
}
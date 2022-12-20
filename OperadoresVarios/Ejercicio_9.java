package OperadoresVarios;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {

/*Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la
contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Correcto!”.
Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos, si no acierta en los 3
intentos mostrar el mensaje “Fallaste jaja!!”).*/

        Scanner consola = new Scanner(System.in);
        String pass = "as123";
        int c = 0;

        System.out.println("Favor ingrese su contrasena");
        String adivinarPass = consola.nextLine();

        if (pass.equals(adivinarPass)) {
            System.out.println("Correcto!");
        } else if (pass.compareTo(adivinarPass) != 0) {
            c++;
            while (c < 3) {
                System.out.println("Contrasena incorrecta, le quedan: " + (3 - c) + " intentos");
                adivinarPass = consola.nextLine();
                c++;
                if (pass.equals(adivinarPass)) {
                    System.out.println("Correcto!");
                    break;
                }
            }
            if (c==4){
                System.out.println("Fallaste jaja!");
            }
        }
    }
}

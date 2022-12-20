package OperadoresVarios;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

/*Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir
(do while), después muestra ese número por consola.*/

        Scanner consola = new Scanner(System.in);

        System.out.println("Favor ingrese un numero");
        float num5 = consola.nextFloat();
        if (num5 < 0) {
            do {
                System.out.println("Favor ingrese un numero nuevamente");
                num5 = consola.nextFloat();
            } while (num5 < 0);
        }
        System.out.println("El numero ingresado es: " + num5);
    }
}

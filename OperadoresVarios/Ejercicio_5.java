package OperadoresVarios;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

//Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es,también debemos indicarlo.

        Scanner consola = new Scanner(System.in);

        System.out.println("Favor ingrese un numero");
        int numDivisible = consola.nextInt();
        if (numDivisible % 2 == 0){
            System.out.println("El numero ingresado es divisible entre 2");
        }else{
            System.out.println("El numero no es divisible entre 2");
        }
    }
}

package OperadoresVarios;

public class Ejercicio_7 {
    public static void main(String[] args) {

//Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.

        int num = 1;
        while (num < 101){
            if ((num % 2 == 0) && (num % 3 == 0)){
                System.out.println("El numero " + num + " es divisible entre 2 y 3");
            }
            num++;
        }

    }
}

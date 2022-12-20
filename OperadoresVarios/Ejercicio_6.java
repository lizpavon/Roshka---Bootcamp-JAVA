package OperadoresVarios;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {

/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
El IVA sera una constante que sera del 10%.*/

        Scanner consola = new Scanner(System.in);

        System.out.println("Favor ingrese el precio del producto");
        double precio = consola.nextDouble();
        System.out.println("El precio final del producto con el iva incluido es de: " + (precio + (precio*0.1)));
    }
}

package OperadoresVarios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {

/* Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no (“De lunes a viernes
consideramos dias laborales”).*/

        Scanner consola = new Scanner(System.in);

        System.out.println("Favor ingrese un dia de la semana");
        String diaSemana = consola.nextLine();

        if (diaSemana.equalsIgnoreCase("sabado") || diaSemana.equalsIgnoreCase("domingo")){
            System.out.println("No es un dia laboral");
        }else{
            System.out.println("Es un dia laboral");
        }
    }
}

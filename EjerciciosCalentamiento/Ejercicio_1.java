package EjerciciosCalentamiento;

import java.util.Random;

public class Ejercicio_1 {
    public static void main(String[] args) {

/*Cargar un array de manera aleatoria con 10 números enteros del -5 al 5. Imprimirlo en pantalla y computar cuál es el
mayor elemento del vector.*/
        int[] arrayAleatorio = new int[10];
        int num = 0;
        Random random = new Random();
        int max = 5;
        int min = -5;
        //Cargar el array
        for (int i = 0; i<10; i++){
            arrayAleatorio[i] = random.nextInt(max-min)+min;
        }

        //Hallar el mayor valor
        int mayor = arrayAleatorio[0];
        for (int i = 0; i<10; i++){
            if(arrayAleatorio[i]>mayor) {
                mayor = arrayAleatorio[i];
            }
            System.out.println(arrayAleatorio[i]);
        }
        System.out.println("El mayor numero es: " + mayor);
    }
}


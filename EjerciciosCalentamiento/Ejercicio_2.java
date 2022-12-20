package EjerciciosCalentamiento;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int array[] = new int[100];
        int min = -30;
        int max = 30;
        int mayorFrec = 0;
        int cMasAlto = 0;
        Random random = new Random();

        //Generar lista
        System.out.println("La lista es:");
        for (int x=0; x<100; x++){
            array[x]=random.nextInt(max-min)+min;
            System.out.printf(array[x]+ " ");
        }

        //Verificar que elementos no estan en la lista
        System.out.println("\nLos numeros que no estan en la lista son: ");
        for (int x=0; x<100; x++){
            int finalX = x;
            if(!Arrays.stream(array).anyMatch(i -> i == finalX)){
                System.out.printf(finalX+" ");
            };
        }

        //Elemento que mas se repite
        for (int x =0; x<100; x++){
            int count = 0;
            for (int j=0; j<100; j++){
                if (array[x]==array[j])
                {
                    count++;
                }
            }
            if (count>cMasAlto){
                cMasAlto = count;
                mayorFrec = array[x];
            }
        }
        System.out.println("\nEl numero que mas se repite es "+mayorFrec);
    }
}
package TorosyVacas;

import java.util.Scanner;

public class TorosVacas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = new int[4];
        int[] arrayIngresado = new int[4];
        int aux = 0;

        //Cargar el array
        array[0] = (int) (Math.random() * 9 + 1);
        aux = (int) (Math.random() * 10);
        for (int m = 1; m < 3; m++) {
            for (int i = 0; i < m; i++) {
                while (aux == array[i]) {
                    aux = (int) (Math.random() * 10);
                }
                array[m] = aux;
            }
            aux = (int) (Math.random() * 10);
        }

        for(int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }

        // Ingresar los numeros y comparar
        int toro = 0;
        while (toro != 4){
            toro = 0;
            int vaca = 0;
            int count = 0;
            while (count < 4) {
                try {
                    System.out.println("Favor ingrese un número menor a 10");
                }
                catch (Exception x){
                    x.printStackTrace();
                }

                int nroIngresado = consola.nextInt();
                arrayIngresado[count] = nroIngresado;
                count++;
            }

            for (int i = 0; i < 4; i++) {
                for (int j = i; j < 3; j++) {
                    if (array[i] == arrayIngresado[j]) {
                        vaca++;
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                if (array[i] == arrayIngresado[i]) {
                    toro++;
                }
            }

            System.out.println("Cantidad de vacas: " + vaca);
            System.out.println("Cantidad de toros: " + toro);
            if (toro != 4) {
                System.out.println("Por favor, intente de nuevo");
            }
        }

        System.out.println("Ganasteeeeeee");
    }
}
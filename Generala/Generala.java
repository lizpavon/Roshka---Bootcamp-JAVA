package Generala;

import java.util.Arrays;

public class Generala {
    public static void main(String[] args) {
        int[] dados = new int[5];
        lanzarDados(dados);
        condiciones(dados);


    }

    //Lanzar dados
    public static void lanzarDados(int[] dados) {
        //for (int i = 0; i < dados.length; i++) {
        //    dados[i] = (int) (Math.random() * 6 + 1);
        dados[0] = 5;
        dados[1] = 2;
        dados[2] = 5;
        dados[3] = 5;
        dados[4] = 2;
        //}
    }

    //Condiciones para ganar
    public static void condiciones(int[] dados) {
        int contador = 0;
        boolean bandera = false;
        boolean validar = false;

        //GENERALA
        if (dados[0] == dados[1] && dados[1] == dados[2] && dados[2] == dados[3] && dados[3] == dados[4]) {
            System.out.println("GENERALA");
            validar = true;
        }

        //FULL
        Arrays.sort(dados);
        if (dados[1] != dados[2])
            if (dados[0] == dados[1] && dados[2] == dados[3] && dados[3] == dados[4]){
                System.out.println("FULL");
                validar = true;}

        //POKER
        if (dados[0] != dados[1] && dados[1] == dados[2] && dados[2] == dados[3] && dados[3] == dados[4]) {
            System.out.println("POKER");
            validar = true;
        }
        if (dados[0] == dados[1] && dados[1] == dados[2] && dados[2] == dados[3] && dados[3] != dados[4]) {
            System.out.println("POKER");
            validar = true;
        }

        //ESCALERA
        Arrays.sort(dados);
        int x = 0;
        if (dados[0] == 1) {
            for (int i = 0; i < dados.length; i++) {
                if (i + 1 == dados[i]) x++;
            }
        }
        if (dados[0] == 2){
            x = 0;
            for (int i = 0; i < dados.length; i++) {
                if (i+2 == dados[i]) x++;
            }
        }

        if (dados[0] == 1 && dados[1]==3) {
            x = 0;
            int primero = dados[0];
            for(int j= 0; j <dados.length-1; j++) {
                dados[j] = dados[j + 1];
            }
            dados[dados.length-1]= primero;

            for (int i = 0; i <dados.length-1; i++) {
                if (i +3 == dados[i]) x++;
            }
            if (dados[dados.length-1] == 1) x++;
        }

        if (x == 5) {
            System.out.println("ESCALERA");
            validar = true;}

        if (validar == false) System.out.println("NADA");
    }
}

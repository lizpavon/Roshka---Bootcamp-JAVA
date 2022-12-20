package EjerciciosCalentamiento;

public class Ejercicio_3 {
    public static void main(String[] args) {

/* Hacer una función que, dada una palabra (String) o frase, diga si la misma es palíndrome o no. Una palabra/frase
palíndrome es aquella que se lee igual tanto de atrás para adelante, como de adelante para atrás. Ejemplos de
palíndromes: "MADAM", "RACECAR", "AMORE, ROMA", "BORROW OR ROB", "WAS IT A CAR OR A CAT I SAW?".*/

        String cadena = "MADAM";
        StringBuilder stringBuilder = new StringBuilder(cadena);
        String cadenaInvertida = stringBuilder.reverse().toString(); //invertimos y convertimos a string para poder comparar despues

        if (cadena.equalsIgnoreCase(cadenaInvertida)){
            System.out.println("palíndrome");
        }else{
            System.out.println("no palíndrome");
        }
    }
}


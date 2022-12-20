package Nim;

import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        pila A = new pila();
        pila B = new pila();
        pila C = new pila();
        Scanner consola = new Scanner(System.in);

        //Cargar pila A
        A.addPila(1);
        A.addPila(2);
        A.addPila(3);

        //Cargar pila B
        B.addPila(1);
        B.addPila(2);
        B.addPila(3);
        B.addPila(4);

        //Cargar pila C
        C.addPila(1);
        C.addPila(2);
        C.addPila(3);
        C.addPila(4);
        C.addPila(5);

        System.out.println("Jugador 1, favor ingrese su nombre");
        String nombre1 = consola.next();

        System.out.println("Jugador 2, favor ingrese su nombre");
        String nombre2 = consola.next();

        while (A != null || B != null || C != null) {

            System.out.println(nombre1 + " favor elija una pila entre A - B - C");
            String pilaElegida = consola.next();

            System.out.println("Favor elija la cantidad de pilas que desea eliminar");
            int pilaEliminada = consola.nextInt();


            switch (pilaElegida) {
                case "A":
                    A.eliminarElemento(pilaEliminada);
                    break;
                case "B":
                    B.eliminarElemento(pilaEliminada);
                    break;
                case "C":
                    C.eliminarElemento(pilaEliminada);
                    break;
            }

            if (A.inicio == null && B.inicio == null &&  C.inicio == null ){
                System.out.println("Ganaste");
                break;
            }

            System.out.println(nombre2 + " favor elija una pila entre A - B - C");
            String pilaElegida2 = consola.next();

            System.out.println("Favor elija la cantidad de pilas que desea eliminar");
            int pilaEliminada2 = consola.nextInt();

            switch (pilaElegida2) {
                case "A":
                    A.eliminarElemento(pilaEliminada2);
                    break;
                case "B":
                    B.eliminarElemento(pilaEliminada2);
                    break;
                case "C":
                    C.eliminarElemento(pilaEliminada2);
                    break;
            }

            if (A.inicio == null && B.inicio == null &&  C.inicio == null ){
                System.out.println("Ganaste");
                break;
            }
        }
    }
}

class pila{
    class nodo{
        int valor;
        nodo next;

        public nodo(int valor){
            this.valor = valor;
        }
    }

    public nodo inicio = null;
    private boolean vacia(){
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public void addPila(int valor){
        if(vacia()) {
            inicio = new nodo(valor);
            return;
        }

        //Pasar el nodo inicial a una variable nueva
        nodo nodoViejo = inicio;
        //crear un nuevo nodo y pasarle el valor del viejo nodo
        nodo nodoNuevo = new nodo(valor);
        nodoNuevo.next = nodoViejo;
        //entonces queda como inicio de mi pila el nuevo valor
        inicio = nodoNuevo;
    }

    public void eliminarElemento(int nro){
        int contador = 0;
        while(contador<nro) {
            nodo inicioNuevo = inicio.next;
            inicio = inicioNuevo;
            //if (inicio == null) System.out.println("vacia");
            contador++;

        }
    }
}
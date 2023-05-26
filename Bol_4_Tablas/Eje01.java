package Bol_4_Tablas;

import Entrada.Entrada;

public class Eje01 {
    public static void main (String [] Args ){
        int numeros [];
        numeros = new int[5];
        numeros = mostrar();
    }

    /**
     * Ingresar 5 numeros para mostrarlos en el mismo 
     * orden que se ingresaron
     */
    public static int[] mostrar() {
        int list [] ;
        list = new int[5];
        for (int i =0; i < 5 ; i++){
            list [i] = Entrada.entero((i+1) + ". Ingresa un numero: ");
        }

        System.out.println("Los numeros ingresados son: ");
        
        for (int i = 0; i < 5 ; i++){
            System.out.println(list[i] );
        }
        return list;
    }
}

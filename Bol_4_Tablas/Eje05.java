package Bol_4_Tablas;

import Entrada.Entrada;

public class Eje05 {
    public static void main(String [] Args) {
        mezcla();
    }

    /**
     * Leer por teclado dos tablas de 10 números enteros y 
     * mezclarlas en una tercera de la forma: el 1º de A, el 1º 
     * de B, el 2º de A, el 2º de B, etc.
     */
    public static void mezcla() {
        int numeros[];
        int num2[];
        int num3[];
        numeros = new int [10];
        num2 = new int [10];
        num3 = new int [20];

        System.out.println("Primera lista. ");
        for (int i =0; i < 10 ; i ++ ){
            numeros[i] = Entrada.entero((i+1)+". Ingresa un numero: ");
        }

        System.out.println("Segunda lista. ");
        for (int i =0; i < 10 ; i ++ ){
            num2[i] = Entrada.entero((i+1)+". Ingresa un numero: ");
        }

        int i = 0;
        for (int j = 0 ; j < 20 ; j++){
            num3[j] = numeros[i];
            j++;
            num3[j] = num2[i];
            i++;
        }

        System.out.println("_____________________________________________");
        for (int j = 0 ; j < i*2 ; j++) {
            System.out.println(num3[j]);
        }
    }
    
}

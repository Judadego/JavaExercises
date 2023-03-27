package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje8 {
    public static void main ( String [] Args ){ 
        numeros();
    }
    public static void numeros (){
        int N = 0 ;
        String mens = "Ingresa un numero: ";
        System.out.println("Programa para mostrar los numeros de 1 a N.");
        N = Entrada.entero(mens);
        inicio(N);   
        System.out.println("Fin del programa. ;)");
    }
    public static void inicio (int N){
        int cont = 0;
        System.out.println("____________");
        while (N != 0 && N > -1){
            cont ++;
            System.out.println(cont);
            N --;
        }
        System.out.println("_____________");
    }
}

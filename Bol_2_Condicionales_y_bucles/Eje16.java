package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje16 {
    public static void main (String [] Args){
        tabla();
    }

    public static void tabla (){
        int num ;
        System.out.println("Ingresa un número para mostrar la tabla de multiplicar. \n(Debe ser de 1 a 10.)");
        num = Entrada.entero("Ingresa un Número: ");
        while (num > 10 || num < 0){
            num = Entrada.entero("Intenta de nuevo: ");
        }
        mult(num);
    }

    public static void mult(int num) {
        for (int i =1; i< 11 ;i++){
            System.out.println(num +" X " + i + " = " +  (num*i));
        }
    }


}

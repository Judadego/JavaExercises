package Bol_2_Condicionales_y_bucles;

import Entrada.*;

public class Eje2 {
    public static void main(String[] Args) {
        positivo();
    }
    public static void positivo() {
        System.out.println("Ingresa un 0 para Finalizar el programa.    ");
        inicio();
        System.out.println("Haz finalizado el programa :)");
    }

    public static void inicio() {
        int a = 0;
        String mens = "Ingresa un número para indicar si es positivo o negativo. ";
        a = Entrada.entero(a, mens);
        while (a != 0) {
            if (a < 0)
                System.out.println(a + " es negativo.");
            else
                System.out.println(a + " es positivo.");
            a = Entrada.entero(a, mens);
        }
    }
}

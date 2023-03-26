package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje1 {
    public static void main(String[] Args) {
        cuadrado();
    }

    public static void cuadrado() {
        System.out.println("Ingresa un número negativo cuando quieras finalizar el Programa.");
        inicio();
        System.out.println("Haz finalizado el programa : )");
    }

    public static void inicio() {
        int a = 0;
        String mens = "Ingresa un número para mostrar su cuadrado: ";
        a = Entrada.entero( mens);
        while (a >= 0) {
            int cuadrado = a * a;
            System.out.println(a + "² es igual a " + cuadrado);
            a = Entrada.entero( mens);
        }
    }
}

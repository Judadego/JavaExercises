package Bol_4_Tablas;

import Entrada.Entrada;

public class Eje02 {
    public static void main(String[] Args) {
        mostrar();
    }

    /**
     * Ingresar cinco numeros para mostrarlos del ultimo al primero 
     */
    public static void mostrar() {
        int F = 5;
        int list[];
        list = new int[F];

        for (int i = 0; i < F; i++) {
            list[i] = Entrada.entero((i + 1) + ". Ingresa un numero: ");
        }

        System.out.println("Los numeros que ingresaste son: ");

        for (int i = F - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}

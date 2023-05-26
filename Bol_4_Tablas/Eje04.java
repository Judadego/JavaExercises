package Bol_4_Tablas;

import Entrada.Entrada;

public class Eje04 {

    public static void main(String[] Args) {
        orden();
    }

    /**
     * Leer 10 números enteros. Debemos mostrarlos en el siguiente orden:
     * el primero, el último, el segundo, el penúltimo, el tercero, etc.
     */
    public static void orden() {
        int list[];
        int reps = 10;
        list = new int[reps];

        for (int i = 0; i < reps; i++) {
            list[i] = Entrada.entero((i + 1) + ". Ingresa un numero: ");
        }
        System.out.println("________________________________________________");
        for (int j = 0; j < (reps/2); j++) {
            System.out.println(list[j]);
            System.out.println(list[(reps - 1) - j]);
        }
    }
}

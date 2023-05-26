package Bol_4_Tablas;

import Entrada.Entrada;

public class Eje08 {
    public static void main(String[] Args) {
        insert();

    }

    /**
     * Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer
     * mediante el teclado 8 números.
     * Después se debe pedir un número y una posición, insertarlo en la posición
     * indicada, desplazando los que estén
     * detrás.
     * 
     */
    public static void insert() {
        int list[];
        int n = 10;
        int num = 0;
        int posicion = 0;
        list = new int[n];
        list = Eje06.doce(n);
        list[8] = 0;
        list[9] = 0;
        posicion = Entrada.entero("Ingresa la posicion a insertar: ");
        num = Entrada.entero("Ingresa el numero a insertar: ");

        list = insertList(list, posicion, num, n);

        for (int i = 0; i < (n); i++) {
            System.out.println(list[i]);
        }

    }

    public static int[] insertList(int list[], int posicion, int num, int n) {
        int insert = 0;
        int almacena = 0;
        boolean t = false;
        for (int i = 7; i >= posicion; i--)
            list[i + 1] = list[i];
        // insertamos el nuevo elemento
        list[posicion] = num;

        /*
         * for (int i = 0; i < n; i++) {
         * if ((posicion - 1) == i) {
         * insert = list[i];
         * list[i] = num;
         * t = true;
         * }
         * if (t) {
         * almacena = list[i + 1];
         * list[i + 1] = insert;
         * insert = almacena;
         * }
         */

        return list;
    }
}

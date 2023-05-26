package Bol_4_Tablas;

import Entrada.Entrada;

public class Eje06 {
    public static void main(String[] Args) {
        name();
    }

    /*
     * Leer los datos correspondiente a dos tablas de 12
     * elementos numéricos, y mezclarlos en una tercera de la
     * forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
     */
    public static void name() {
        int num[];
        int num1[];
        int num2[];

        int n = 12;
        num = new int[n];
        num1 = new int[n];
        num2 = new int[(n * 2)];

        System.out.println("Primera lista.");
        num = doce(n);

        System.out.println("Segunda lista.");
        num1 = doce(n);

        num2 = mezcla(n, num, num1);
        for (int i = 0; i < (n * 2); i++) {
            System.out.println(num2[i]);
        }

    }

    /**
     * ingresa las n veces que se va a recibir parameros,
     * funcion que pide n numeros y los almacena en una lista
     *
     * @return list[n]
     */
    public static int[] doce(int n) {
        int list[];
        list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Entrada.entero((i + 1) + ". Ingresa un numero: ");
        }
        return list;
    }

    /**
     * ingresa dos listas con el n que contiene cada lista,
     * asumiendo que las dos tienen la misma cantidad de valores
     * 
     * @param list1[]
     * @param list2[]
     * @return list[n*2]
     */
    public static int[] mezcla(int n, int list1[], int list2[]) {
        int list[];
        int cont1 = 0;
        int cont2 = 0;
        n = n * 2;
        list = new int[(n)];

        for (int i = 0; i < (n); i++) {
            for (int j = 0; j < 3; j++) {
                list[i] = list1[cont1];
                cont1++;
                i++;
            }
            for (int k = 0; k < 3; k++) {
                list[i] = list2[cont2];
                cont2++;
                i++;
            }
            i--;
        }
        return list;
    }
}

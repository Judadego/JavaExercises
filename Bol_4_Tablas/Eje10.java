package Bol_4_Tablas;

import Entrada.Entrada;

public class Eje10 {
    public static void main(String[] Args) {
        nposiciones();
    }

    public static void nposiciones() {
        int list[];
        int n = 10;
        int desplaza = 0;
        list = new int[n];
        System.out.println("Ingresa 10 numeros: ");
        list = Eje06.doce(n);
        System.out.println("Ingresa las veces que se va a desplazar: ");
        desplaza = Entrada.entero("Ingresa las veces que se va a desplazar: ");
        list = desliz(list, desplaza, n);

    }

    /* arreglar aqui vamos desplazaer las veces introducidas por teclado */
    public static int[] desliz(int list[], int desplaza, int n) {
        int copia[] = list.clone();
        int result = 0;
        // desplazamos hacia abajo n posiciones
        for (int i = 0; i < n; i++){
            result = (i + desplaza) % n;
            list[i] = copia[(i + desplaza) % n];
            /*al usar modulo de 10, no permitimos que se salga de la lista
             * o que la ubicacion esté dentro del rango...
             */
        }
        // la tabla funciona como si fuese circular por eso utilizamos el módulo
        System.out.println("\n\nLa tabla queda:");
        for (int i = 0; i < 10; i++)
            System.out.println(list[i]);

        return list;
    }
}

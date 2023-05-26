package Bol_4_Tablas;

import Entrada.Entrada;

public class Eje12 {
    public static void main(String[] Args) {
        eliminarElementoTabla();
    }

    /*
     * Leer por teclado una tabla de 10 elementos numéricos enteros y una posición
     * (entre 0 y 9). Eliminar el
     * elemento situado en la posición dada sin dejar huecos.
     * 
     */
    public static void eliminarElementoTabla() {
        int list[];
        int n = 10;
        int posicion = 0;
        System.out.println("Ingresa 10 numeros: ");
        list = Eje06.doce(n);
        posicion = Entrada.entero("Que posición deseas eliminar? (1 a 10): ") - 1;
        if (posicion >= 1 && posicion <= list.length) {
            list = elimin(list, posicion);
            Eje11.print(list, (n - 1));
        } else {
            System.out.println("La posición ingresada no es válida.");
        }
    }

    /**
     * Elimina un elemento de un arreglo en la posición indicada.
     * Los elementos restantes del arreglo se desplazan hacia la izquierda para
     * llenar el espacio vacío.
     * 
     * @param list Arreglo de enteros del cual se eliminará un elemento.
     * @param posicion  Posición del elemento a eliminar.
     * @return Arreglo modificado después de la eliminación del elemento.
     */
    public static int[] elimin(int list[], int posicion) {
        int n = list.length;
        for (int i = posicion; i < (n - 1); i++) {
            list[i] = list[i + 1 % n];
        }
        list[n - 1] = 0;
        return list;
    }

}

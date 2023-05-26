package Bol_4_Tablas;

import Entrada.Entrada;

public class Eje11 {
    public static void main(String[] Args) {
        tabla();
    }

    /**
     * Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
     * Éstos los guardaremos en una
     * tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para
     * que la tabla continúe ordenada.
     */
    public static void tabla() {
        int list[];
        int n = 10;
        int num = 0;
        list = new int[n];
        System.out.println("Ingresa 5 numeros ordenados de forma creciente: ");
        for (int i = 0; i < (n/2); i++) {
            list[i] = Entrada.entero((i + 1) + ". Ingresa un numero: ");
        }
        num = Entrada.entero("Ingresa un numero para insertarlo" +
                " en el lugar adecuado: ");
        list = orden(list, n, num);
        print(list, n);
    }

    public static int[] orden(int list[], int n, int num) {
        int copy[];
        copy = new int[n];
        copy = list;
        int j = 0;
        int sitio = 0 ;
        while (list[j]<num && j<=n){
            sitio ++;
            j++;
        }
        
        for (int i = n/2; i >=sitio; i--) {
            list[i+1]= list[i];
        }

        list[sitio] = num ;
        return copy;
    }

    /**
     * imprime una tabla en el orden que sea ingresada, 
     * se requiere la list[]; y n que corresponde a n posiciones de list[n] 
     * [Ya no se requiere ingresar n, se debe ingresar un valor pero no se toma en cuenta..]
     * @param list
     * @param n
     */
    public static void print(int list[], int n) {
        n = list.length;
        System.out.println("____________________________");
        for ( int i = 0; i<n; i++){
            System.out.println(list[i]);
        }
    }

}

package Bol_4_Tablas;

public class Eje09 {
    public static void main(String[] Args) {
        deslice();
    }

    /**
     * Crear un programa que lea por teclado una tabla de 10 números enteros y la
     * desplace una posición hacia
     * abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y
     * así sucesivamente. El último pasa a
     * ser el primero.
     * 
     */
    public static void deslice() {
        int list[];
        int n = 10;
        list = new int[n];
        System.out.println("Ingresa 10 numeros.");
        list = Eje06.doce(n);
        list = desliz(list, n);
        System.out.println("La lista desplazada...");
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);
        }

    }

    /**
     * ingresa una lista [n] para que se desplacen una posición hacia arriba
     * 
     * @param list
     * @return list
     */
    public static int[] desliz(int list[], int n) {
        int num = list[0];
        int num2 = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                list[(n - 1) - i] = num;
            } else {
                num2 = list[i + 1];
                list[i + 1] = num;
                num = num2;
            }
        }
        return list;
    }
}

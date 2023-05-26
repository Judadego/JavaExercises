package Bol_4_Tablas;

public class Eje07 {
    public static void main(String[] Args) {
        orden();
    }

    /**
     * Leer por teclado una serie de 10 números enteros. La aplicación debe
     * indicarnos si los números están
     * ordenados de forma creciente, decreciente, o si están desordenados.
     * 
     */
    public static void orden() {
        int num[];
        String result = "";
        int n = 10;
        num = new int[n];
        num = Eje06.doce(n);
        result = orden(num, n);
        System.out.println("La lista esta en " + result);
    }

    /**
     * Ingresa una lista ( num[ ] ) y el numero de registros que esta contiene ( n )
     * para determinar si el orden es acendente, desendente o desordenados.
     * 
     * @param int num[n]
     * @param int n
     * @return String result
     */
    public static String orden(int num[], int n) {
        int ult = 0;
        boolean asc = false;
        boolean des = false;
        String result = " ";
        for (int i = 0; i < n; i++) {

            if (num[i] > ult && i > 0) {
                asc = true;
                result = "ascendente";
            } else if (num[(n - 1) - i] < ult) {
                des = true;
                result = "descendente";
            }
            ult = num[i];
        }

        if (asc == true && des == true) {
            result = "desorden";
        } else if (asc == false && des == false) {
            result = "numeros identicos";
        }
        return result;
    }

}

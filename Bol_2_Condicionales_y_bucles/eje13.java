package Bol_2_Condicionales_y_bucles;

import Entrada.AFrases;
import Entrada.Entrada;

public class Eje13 {
    public static void main(String[] Args) {
        pedir10();
    }

    /**
     * Pide 10 numeros y determina si son negativos, positivos o ceros
     * imprime la media de los positivos y negativos
     * imprime cuantos ceros se ingresaron.
     */
    public static void pedir10() {
        int num = 0;
        int contNeg = 0;
        int contPos = 0;
        int contCer = 0;

        int sumPos = 0;
        int sumNeg = 0;

        int mediaPos;
        int mediaNeg;

        System.out.println(AFrases.oFrase("057"));

        for (int i = 0; i < 10; i++) {
            num = Entrada.entero((i+1) + ". " + AFrases.oFrase("058"));
            if (num > 0) {
                contPos++;
                sumPos = sumPos + num;
            } else if (num < 0) {
                contNeg++;
                sumNeg = sumNeg + num;
            } else if (num == 0) {
                contCer++;
            }
        }
        mediaPos = media(sumPos, contPos);
        mediaNeg = media(sumNeg, contNeg);
        System.out.println(String.format(AFrases.oFrase("059"),
                "negativos", mediaNeg));
        System.out.println(String.format(AFrases.oFrase("059"),
                "positivos", mediaPos));
        System.out.println("La cantidad de ceros ingresados es: " + contCer);
    }

    /**
     * @param sum      = la suma de los numeros
     * @param contador = la cantidad de numeros sumados.
     * @return (int media)
     */
    public static int media(int sum, int contador) {
        int media = 0;
        if (sum != 0)
            media = sum / contador;
        return media;
    }

}

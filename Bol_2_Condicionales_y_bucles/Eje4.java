package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje4 {
    public static void main(String[] Args) {
        conteo();
    }
    public static void conteo() {
        System.out.println("Ingresa numeros para contar cuantos haz ingresado");
        System.out.println("Para finalizar el conteo, ingresa un numero negativo.");
        inicio("CONTEO");
        System.out.println("Haz finalizado el programa :)");
    }

    public static int inicio(String pgm) {
        int a = 0;
        int cont = 0;
        int sum = 0;
        int media = 0;
        String mens = "ingresa un numero";
        a = Entrada.entero(a, mens);
        while (a >= 0) {
            cont++;
            sum = sum + a;
            a = Entrada.entero(cont, mens);
        }
        media = sum / cont;
        if (pgm == "MEDIA")
            sum = media;
        else if (pgm == "CONTEO")
            System.out.println("Ingresaste " + cont + " numeros positivos y 1 negativo XD.");
        return sum;
    }
}

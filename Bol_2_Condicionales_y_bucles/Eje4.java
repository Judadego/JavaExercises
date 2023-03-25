package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje4 {
    public static void main(String []Args) {
        System.out.println("Ingresa numeros para contar cuantos haz ingresado");
        System.out.println("Para finalizar el conteo, ingresa un numero negativo.");
        inicio();
        System.out.println("Haz finalizado el programa :)");
    }
    public static void inicio() {
        int a = 0;
        int cont = 0;
        String mens = "ingresa un numero";
        a = Entrada.entero(a, mens);
        while (a >= 0 ){
            cont ++;
            a = Entrada.entero(cont, mens);
        }
        System.out.println("Ingresaste " + cont + " numeros positivos y 1 negativo XD.");
    }
}

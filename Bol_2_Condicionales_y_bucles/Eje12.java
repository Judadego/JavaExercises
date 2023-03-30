package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje12 {
    public static void main(String []Args) {
        factorial();
    }
    public static void factorial() {
        double fact = 0 ;
        double  result = 0;
        double  result1 = 1;
        System.out.println("Programa para hallar el factorial de un número.");
        fact = Entrada.entero("Ingresa un número: ");
        result = fact * (fact -1);
        for (double i = fact-1;i>1;i --){
            result1 = i - 1;
            result = result *result1;
        }
        System.out.println("El factorial de " + fact + " es "+ result);
    }
}

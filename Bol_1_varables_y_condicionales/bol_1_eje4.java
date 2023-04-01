package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje4 {
    public static void main ( String [] args){
        double a,b;

        System.out.println("Ingresa dos numeros para ver si son iguales.");
        System.out.println("ingresa el primer número: ");
        Scanner A = new Scanner(System.in);
        a = A.nextDouble();

        System.out.println("ingresa el segundo número: ");
        Scanner B = new Scanner(System.in);
        b = B.nextDouble();
        B.close();
        A.close();
        if (a == b){
            System.out.println("El número " + a + " es igual a " + b);
        }else{
            System.out.println("El número " + a + " no es igual a "+ b);
        }
    }
}

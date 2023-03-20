package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje8 {
    public static void main(String [] args){
        Integer a,b; 

        System.out.println("Ingresa dos números para verificar cual es mayor o si son iguales.");
        System.out.println("Ingresa el primer número: ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();

        System.out.println("Ingresa el segundo número: ");
        Scanner B = new Scanner(System.in);
        b = B.nextInt();

        if (a < b){
            System.out.println(b + " es mayor que " + a );
        }else if (a == b) {
            System.out.println(a + " es igual a " + b );
        }else{
            System.out.println(a + " es mayor que " + b );
        }     
    }
}

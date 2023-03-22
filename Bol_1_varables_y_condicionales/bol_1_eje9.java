package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje9 {
    public static void main (String []args){
        Integer a,b;

        System.out.println("Ingresa dos números para devolverlos organizados.");
        System.out.println("ingresa el primer número: ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();
        A.close();
        System.out.println("Ingresa el segundo número: ");
        Scanner B = new Scanner (System.in);
        b = B.nextInt();
        B.close();
        System.out.println("________________________");
        if (a < b ){
            System.out.println(a);
            System.out.println(b);
        }else{
            System.out.println(b);
            System.out.println(a);
        }
    }
}

package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje10 {
    public static void main (String []args){
        int a,b,c;

        System.out.println("Ingresa tres números para devolverlos organizados.");
        System.out.println("ingresa el primer número: ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();

        System.out.println("Ingresa el segundo número: ");
        Scanner B = new Scanner (System.in);
        b = B.nextInt();

        System.out.println("Ingresa el tercer número: ");
        Scanner C = new Scanner (System.in);
        c = C.nextInt();        
        C.close();
        A.close();
        B.close();
        System.out.println("________________________");
        if (a < b & a < c){
            System.out.println(a);
            if (b < c){
                System.out.println(b);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(b);
            }
        }else if (b < a & b < c ){
            System.out.println(b);
            if (a < c){
                System.out.println(a);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(a);
            }
        }else{
            System.out.println(c);
            if(a < b ){
                System.out.println(a);
                System.out.println(b);
            }else{
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}

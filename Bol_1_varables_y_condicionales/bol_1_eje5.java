package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje5 {
    public static void main (String [] args){
        double a;

        System.out.println("Ingresa un número para verificar si es positivo o negativo: ");
        Scanner A = new Scanner(System.in);
        a = A.nextDouble();
        
        if (a < 0 ){
            System.out.println("El número "+ a + " es negativo.");
        }else{
            System.out.println("El número " + a +" no es negativo.");
        }
    }
}

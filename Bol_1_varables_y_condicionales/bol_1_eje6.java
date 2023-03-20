package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje6 {
    public static void main(String[] args) {
        Integer a, b;

        System.out.println("Ingresa dos números para verificar si son múltiplos.");
        System.out.println("Ingresa el primer número: ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();
        System.out.println("Ingresa el segundo número: ");
        Scanner B = new Scanner(System.in);
        b = B.nextInt();
        if (a > b) {
            if (a % b == 0) {
                System.out.println("El número " + a + " es múltiplo de " + b);
            } else {
                System.out.println("Los números no son múltiplos.");
            }
        }else if(b % a == 0 ){
            System.out.println("Los números "+ a + " y "+ b + " no son múltiplos, intenta ingresar el mayor primero.");
        }else{
            System.out.println("Los números no son múltiplos.");
        }
    }
}

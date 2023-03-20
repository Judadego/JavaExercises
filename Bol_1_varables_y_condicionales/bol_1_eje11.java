package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje11 {
    public static void main(String[] args) {
        int a;
        int cifra = 0;
        char ese = 's';
        char point = '.';
        
        System.out.println("Ingresa un número para verificar cuantas cifras tiene. ");
        System.out.println("ingresa un número entre 0 y 9.999: ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();

        if (a < 10000) {
            if (a <= -1) {
                System.out.println("El número está fuera del rango. Recuerda debe estar entre 0 y 9.999");
            } else {
                if (a >= 0 & a < 10) {
                    cifra = 1;
                    ese = point;
                    point = ' ';
                } else if (a >= 10 & a < 100) {
                    cifra = 2;
                } else if (a >= 100 & a < 1000) {
                    cifra = 3;
                } else if (a >= 1000 & a < 10000) {
                    cifra = 4;
                }
                System.out.println("El número " + a + " tiene " + cifra + " cifra" + ese + point);
            }
        } else {
            System.out.println("El número está fuera del rango. Recuerda debe estar entre 0 y 9.999");
        }
    }
}

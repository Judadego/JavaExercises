package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje12 {
    public static void main(String[] Args) {
        int a;
        int dm, um, c, d, u;
        System.out.println("Ingresa un número de máx. 5 cifras para mostrarlo con sus cifras al revés. ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();
        A.close();
        if (a < 100000) {
            if (a > 0) {
                u = a % 10;
                a = a / 10;
                if (a > 0) {
                    d = a % 10;
                    a = a / 10;
                    if (a > 0) {
                        c = a % 10;
                        a = a / 10;
                        if (a > 0) {
                            um = a % 10;
                            a = a / 10;
                            if (a > 0) {
                                dm = a % 10;
                                a = a / 10;
                                System.out.println("" + u + d + c + um + dm);
                            } else {
                                System.out.println("" + u + d + c + um);
                            }
                        } else {
                            System.out.println("" + u + d + c);
                        }
                    } else {
                        System.out.println("" + u + d);
                    }
                } else {
                    System.out.println(u);
                }
            } else {
                System.out.println("Debe ingresar un numero mayor que cero.");
            }
        }else{
            System.out.println("El numero es de más de 5 cifras. ");
        }
    }
}

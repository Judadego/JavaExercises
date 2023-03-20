package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje13 {
    public static void main(String[] Args) {
        String num = "";
        String  b;
        int dm, um, c, d, u;
        int a;
        System.out.println("Ingresa un número de máx. 5 cifras para mostrarlo con sus cifras al revés. ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();
        b = ""+ a;
        if (a < 100000) {
            if (a > 10) {
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
                                num = "" + u + d + c + um + dm;
                            } else {
                                num = "" + u + d + c + um;
                            }
                        } else {
                            num = "" + u + d + c;
                        }
                    } else {
                        
                        num = "" + u + d;
                    }
                } else {
                    num = "" + u;
                }
            } else {
                num = num + a;
                System.out.println("Debe ingresar un numero con mas de dos dígitos.");
            }
        }else{
            System.out.println("El numero es de más de 5 cifras. ");
        }

        if((Integer.parseInt(num) == Integer.parseInt(b))&& (Integer.parseInt(b) > 10) ){
            System.out.println("El numero "+ b +" es capicúa: " + num );
        }else if (Integer.parseInt(b)>10){
            System.out.println("El número " + b + " no es Capicúa: " + num);
        }
    }
}

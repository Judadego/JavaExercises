package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje15 {
    public static void main (String [] Args ){
        int d, m ,y;

        try {
            System.out.println("Ingresa una fecha para validar si es correcta. (*YYYYMMDD)");
            System.out.println("Ingresa el año (*YYYY): ");
            Scanner Y = new Scanner(System.in);
            y = Y.nextInt();
            Y.close();
            if(y < 1900 || y > 9999){
                System.out.println("Debe ser mayor que 1900 y menor que 9999.");
                return;
            }
            System.out.println("Ingresa el mes (*MM): ");
            Scanner M = new Scanner(System.in);
            m = M.nextInt();
            M.close();
            if(m < 0||m > 13){
                System.out.println("Debe ser mayor que 0 y menor que 13.");
                return;
            }
            System.out.println("Ingresa el día (*DD): ");
            Scanner D = new Scanner(System.in);
            d = D.nextInt();
            D.close();
            if(d < 0|| d > 32){
                System.out.println("Debe ser mayor que 0 y menor que 32.");
                return;
            }
        }catch(Exception ex){
            System.out.println("Error. Debe ser numerico.");
            return;
        }
        System.out.println("La fecha es correcta :)");
    }
}

package Bol_1_varables_y_condicionales;

import Bol_1_varables_y_condicionales.bol_1_eje17;

import java.util.Scanner;

public class bol_1_eje19 {
    public static void main (String [] Args){
        int d, m , y ;
        int d1, m1 , y1;
        int dias = 0 ;
        int mese = 0 ;
        int anio = 0 ;
        int numDias = 0;
        
        System.out.println("Ingresa el día fecha 1: ");
        Scanner D = new Scanner(System.in);
        d = D.nextInt();

        System.out.println("Ingresa mes fecha 1: ");
        Scanner M = new Scanner (System.in);
        m = M.nextInt();
        
        System.out.println("ingresa año fecha 1:");
        Scanner Y = new Scanner (System.in);
        y = Y.nextInt();

        System.out.println("Ingresa el día fecha 2: ");
        Scanner D1 = new Scanner (System.in);
        d1 = D1.nextInt();

        System.out.println("Ingresa mes fecha 2: ");
        Scanner M1 = new Scanner (System.in);
        m1 = M1.nextInt();

        System.out.println("ingresa año fecha 1:");
        Scanner Y1 = new Scanner (System.in);
        y1 = Y1.nextInt();

        numDias = bol_1_eje17.Dias(m);
        dias = d1 - d;
        mese = (m1 - m)*numDias;
        anio = (y1 - y )*365;

        System.out.println(dias+ mese+anio);

    }
}

package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje20 {
    public static void main(String[] Args) {
        int h=0, m =0, s =0;
        String Hora = "";
        try {
            System.out.println("Ingresa la hora en fomra |hora | minutos | segundos.");
            System.out.println("ingresa Hora: ");
            Scanner H = new Scanner(System.in);
            h = H.nextInt();

            System.out.println("Ingresa los minutos: ");
            Scanner M = new Scanner(System.in);
            m = M.nextInt();

            System.out.println("Ingresa los segundos: ");
            Scanner S = new Scanner(System.in);
            s = S.nextInt();
            H.close();
            M.close();
            S.close();
        } catch (Exception ex) {
            System.out.println("Intenta solo ingresar numeros.");
        }       
        Hora = hora(h, m, s);
        System.out.println("La hora es:"+Hora);
    }
    public static String hora (int h , int m , int s){
        String Hora = " ";
        if (s >= 59){
            s = 0;
            m ++;
            if (m >= 59 ){
                m = 0; 
                h ++;
                if (h >= 24)
                    h = 0;
            }
        }else
            s ++;
        Hora = Hora + h + ":"+m+":"+s;
        return Hora;
    }
}

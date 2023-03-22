package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje16 {
    public static void main(String[] Args) {
        int d = 0;
        int m = 0;
        int y = 0;
        int numDias=0;
        boolean err = false;
        String mensErr = "";

        try {
            System.out.println("Ingresa una fecha para validar si es correcta. (*YYYYMMDD)");
            System.out.println("Ingresa el año (*YYYY): ");
            Scanner Y = new Scanner(System.in);
            y = Y.nextInt();
            Y.close();
            if (y < 1000 || y > 9999) {
                err = true;
                mensErr = ("El año debe ser mayor que 1000 y menor que 9999. ");
            }
            System.out.println("Ingresa el mes (*MM): ");
            Scanner M = new Scanner(System.in);
            m = M.nextInt();
            M.close();
            if (m < 0 || m > 13) {
                err = true;
                mensErr = mensErr + ("El mes debe ser mayor que 0 y menor o igual que 12. ");
            }
            System.out.println("Ingresa el día (*DD): ");
            Scanner D = new Scanner(System.in);
            d = D.nextInt();
            D.close();
            numDias = Dias(m);
            if (d < 0 || d > numDias) {
                err = true;
                if ( numDias <=0)
                    mensErr = mensErr + "El día no se pudo validar. "             ;
                else
                    mensErr = mensErr + ("El día debe ser mayor que 0 y menor o igual que "+ numDias+ ".");
            }
        } catch (Exception ex) {
            System.out.println("Error. Debe ser numerico.");
            err = true;
            return;
        }
        if (err){
            System.out.println("Error!. "+ y + "/"+ m+ "/"+d+" no es correcto!. " + mensErr);
        }else{
            System.out.println("La fecha " + y + "/"+ m+"/"+d+" es correcta!");
        }
    }
    public static int Dias(int m) {
        int numDias=0;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                numDias = 28;
                break;
        }
        return numDias;
    }
}

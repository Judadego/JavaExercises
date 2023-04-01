package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje17 {
    public static void main(String[] Args) {
        int d = 0;
        int m = 0;
        int y = 0;
        int numDias=0;
        boolean err = false;
        String mensErr = "";
        String diaSig = "" ;
        int indicador = 0;

        try {
            System.out.println("Ingresa una fecha para determinar el siguiente día. (*YYYYMMDD)");
            System.out.println("Ingresa el año (*YYYY): ");
            Scanner Y = new Scanner(System.in);
            y = Y.nextInt();

            if (y == 0 || y > 9999) {
                err = true;
                mensErr = ("El año debe ser diferente de 0 y menor que 9999. ");
            }
            System.out.println("Ingresa el mes (*MM): ");
            Scanner M = new Scanner(System.in);
            m = M.nextInt();

            if (m < 0 || m > 13) {
                err = true;
                mensErr = mensErr + ("El mes debe ser mayor que 0 y menor o igual que 12. ");
            }
            System.out.println("Ingresa el día (*DD): ");
            Scanner D = new Scanner(System.in);
            d = D.nextInt();
            D.close();
            Y.close();
            M.close();
            numDias = Dias(m);
            if (d < 0 || d > numDias) {
                err = true;
                if ( numDias <=0)
                    mensErr = mensErr + "El día no se pudo validar. "             ;
                else
                    mensErr = mensErr + ("El día debe ser mayor que 0 y menor o igual que "+ numDias+ " para el mes "+ m+".");
            }
        } catch (Exception ex) {
            System.out.println("Error. Debe ser numerico.");
            err = true;
            return;
        }
        if (err){
            System.out.println("Error!. "+ y + "/"+ m+ "/"+d+" no es correcto!. " + mensErr);
            return;
        }else{
            //System.out.println("La fecha " + y + "/"+ m+"/"+d+" es correcta!");
        }
        diaSig = diaSig(d,m,y,numDias);
        System.out.println("La fecha del día siguiente es "+ diaSig);

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
    public static String diaSig (int d ,int m ,int y,int numDias){
        String fecha = "";
        if (d == numDias ){
            d = 1;
        }else
            d = d +1;
        if ( m ==12 ){
            m = 1;
            y ++;
        }else
            m ++;
        if (y == 0 )
            y ++;
        fecha =  d +"/" + m +"/" +y;
        return fecha;
    }
}

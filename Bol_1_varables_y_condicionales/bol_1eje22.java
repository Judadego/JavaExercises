package Bol_1_varables_y_condicionales;

import Bol_1_varables_y_condicionales.bol_1_eje21;

public class bol_1eje22 {
    public static void main(String[] Args) {
        inicio();     
    }
    public static void inicio (){
        int num = 0;
        String mens = "Ingresa un número entre 0 y 99: ";
        String Numstr = "";
        num = bol_1_eje21.Entrada(num, mens);
        if (num < 0 || num > 99) {
            System.out.println("Intenta otra vez (0 - 99).");
            num = bol_1_eje21.Entrada(num, mens);
            Numstr = numStr(num);
        } else {
            Numstr = numStr(num);
        }
        System.out.println(Numstr);
    }
    public static String numStr(int num) {
        String Numstr = "";
        if (num <= 99 && num > 0) {
            if (num < 10 && num >= 0) {
                Numstr = bol_1_eje21.Numero(num);
                return Numstr;
            } else if (num >= 10 && num < 20) {
                switch (num) {
                    case 10:
                        Numstr = "Diez";
                        break;
                    case 11:
                        Numstr = "Once";
                        break;
                    case 12:
                        Numstr = "Doce";
                        break;
                    case 13:
                        Numstr = "Trece";
                        break;
                    case 14:
                        Numstr = "Catorce";
                        break;
                    case 15:
                        Numstr = "Quince";
                        break;
                    case 16:
                        Numstr = "Dieciséis";
                        break;
                    case 17:
                        Numstr = "Diecisiete";
                        break;
                    case 18:
                        Numstr = "Dieciocho";
                        break;
                    case 19:
                        Numstr = "Diecinueve";
                        break;
                }
            }else if(num >= 20 && num < 30){
                Numstr = "Veint";
                num =  num -20;
                if (num > 0 )
                    Numstr = Numstr + "i" + bol_1_eje21.Numero(num);
                else
                    Numstr = Numstr + "e";
            }else if (num >= 30 && num < 40){
                Numstr = "Treinta";
                num = num - 30 ;
                Numstr = cond(Numstr, num);
            }else if (num >= 40 && num < 50 ){
                Numstr = "Cuarenta";
                num = num - 40;
                Numstr = cond(Numstr, num);
            }else if (num >= 50 && num < 60){
                Numstr = "Cincuenta";
                num = num - 50;
                Numstr = cond(Numstr, num);
            }else if ( num >= 60 && num < 70){
                Numstr = "Sesenta";
                num = num - 60;
                Numstr = cond(Numstr, num);
            }else if ( num >= 70 && num <80 ){
                Numstr = "Setenta";
                num = num - 70;
                Numstr = cond(Numstr, num);
            }else if( num >= 80 && num < 90 ){
                Numstr = "Ochenta";
                num = num - 80;
                Numstr = cond(Numstr, num);
            }else if ( num >= 90 && num < 100){
                Numstr = "Noventa";
                num = num - 90;
                Numstr = cond(Numstr, num);
            }
        }
        return Numstr;
    }
    public static String cond (String Numstr, int num){
        String y = " y ";
        if (num > 0 )
        Numstr = Numstr + y + bol_1_eje21.Numero(num);
        return Numstr;
    }
}

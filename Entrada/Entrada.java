package Entrada;

import java.util.Scanner;

public class Entrada {
    
    /**
     * @param mens
     * = mensaje a mostrar al solicitar ingresar el dato tipo int.
     * @return
     * (int numero)
     */
    public static int entero( String mens) {
        int Nota = 0;
        System.out.println(mens);
        try {
            Scanner nota = new Scanner(System.in);
            Nota = nota.nextInt();
            //nota.close();
        } catch (Exception ex) {
            System.out.println("Error! Debe ser un dato numérico.");
            Nota = entero(mens);
        }
        return Nota;
    }
    /*
     * @param mens
     * = mensaje a imprimir
     * @return
     * (String cadena)
     */
    public static String string(String mens) {
        String cadena = "";
        System.out.println(mens);
        try {
            Scanner Cadena = new Scanner(System.in);
            cadena = Cadena.nextLine();
        }catch(Exception ex){
            System.out.println("Error.");
            cadena = string(mens);
        }
        return cadena;
    }
}

package Entrada;

import java.util.Scanner;

public class Entrada {
    
    public static int entero(int entero, String mens) {
        int Nota = entero;
        System.out.println(mens);
        try {
            Scanner nota = new Scanner(System.in);
            Nota = nota.nextInt();
            //nota.close();
        } catch (Exception ex) {
            System.out.println("Error! Debe ser un dato numérico.");
            Nota = entero(Nota,mens);
        }
        return Nota;
    }
}

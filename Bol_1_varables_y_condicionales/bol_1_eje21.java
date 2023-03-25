package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje21 {
    public static void main(String[] Args) {
        int Nota = 0;
        String Numero = "";
        String mens = "Ingresa una nota de 0 a 10: ";
        Nota = Entrada(Nota,mens);
        if (Nota > 10 || Nota < 0) {
            System.out.println(Nota + " No es válida. Intenta una vez más...");
            Nota = 0;
            Nota = Entrada(Nota,mens);
            Numero = Numero(Nota);
        } else {
            Numero = Numero(Nota);
        }
        System.out.println(Numero);
    }
    public static int Entrada(int Nota, String mens) {
        System.out.println(mens);
        try {
            Scanner nota = new Scanner(System.in);
            Nota = nota.nextInt();
            //nota.close();
        } catch (Exception ex) {
            System.out.println("Error! Debe ser un dato numérico.");
            Nota = Entrada(Nota,mens);
        }
        return Nota;
    }
    public static String Numero(int Nota) {
        String Numero = "";
        switch (Nota) {
            case 0:
                Numero = "Cero";
                break;
            case 1:
                Numero = "Uno";
                break;
            case 2:
                Numero = "Dos";
                break;
            case 3:
                Numero = "Tres";
                break;
            case 4:
                Numero = "Cuatro";
                break;
            case 5:
                Numero = "Cinco";
                break;
            case 6 :
                Numero = "Seis";
                break;
            case 7: 
                Numero = "Siete";
                break;
            case 8:
                Numero = "Ocho";
                break;
            case 9:
                Numero = "Nueve";
                break;
            case 10:
                Numero = "Diez";
                break;
            default:
                Numero = "El numero no está dentro del rango (0-10).";
                break;
        }
        return Numero;
    }
}

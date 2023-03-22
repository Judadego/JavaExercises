package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje3 {
    public static void main (String[] args){
        double r = 0.0;
        double D = 0.0;

        System.out.println("Ingresa el radio de un circulo para hallar su longitud: ");
        Scanner R = new Scanner(System.in);
        r = R.nextDouble();
        R.close();

        D = 2*Math.PI*r;
        System.out.println("La longitud del círculo es: " + D); 
    }
}

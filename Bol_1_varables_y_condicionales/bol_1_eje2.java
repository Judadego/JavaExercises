package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje2 {
    public static void main(String[] args) {
        double r = 0.0;
        double A = 0.0;

        System.out.println("Ingresa el radio de un circulo para hallar su área: ");
        Scanner R = new Scanner(System.in);
        r = R.nextDouble();
        R.close();

        A = Math.PI*Math.pow(r, 2); //Math.pow Multiplica r ^ b 

        System.out.println("El área del círculo es : " + A);

    }
}

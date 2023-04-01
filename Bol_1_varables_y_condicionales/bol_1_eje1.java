package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje1 {
    public static void main(String[] args) {
        double a, b, c; // ecuacion = ax^2+bx+c=0
        double x1, x2, d; // soluciones y determinante

        System.out.println("Introdusca primer coeficiente (a): ");
        Scanner A = new Scanner(System.in);
        a = A.nextDouble();
        System.out.println("Introduzca coeficiente (b): ");
        Scanner B = new Scanner(System.in);
        b = B.nextDouble();
        System.out.println("Introduzca coeficiente (c): ");
        Scanner C = new Scanner(System.in);
        c = C.nextDouble();
        A.close();
        B.close();
        C.close();

        // calculamos el determinante
        if (a == 0 || b == 0 || c == 0)
            System.out.println("No existen soluciones reales.");
        else {
            d = ((b * b) - 4 * a * c);

            if (d <= 0)
                System.out.println("No existen soluciones reales.");
            else {
                x1 = (-b + Math.sqrt(d) / (2 * a));
                x2 = (-b - Math.sqrt(d) / (2 * a));
                System.out.println("Solucion: " + x1);
                System.out.println("Solución: " + x2);
            }
        }
    }

}
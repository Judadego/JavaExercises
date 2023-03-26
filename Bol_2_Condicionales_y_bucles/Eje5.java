package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje5 {
    public static void main(String[] Args) {
        adivinaNum();
    }
    public static void adivinaNum() {
        System.out.println("Ingresa un número para adivinarlo. (De 0 a 10.000)");
        int n = inicio();
        System.out.println("Haz acertado el numero es " + n);
    }

    public static int inicio() {
        int n = 0;
        int num;
        String mens = "Ingresa un número: ";
        String mens0 = "Mayor";
        String mens1 = "Menor";
        int cont = 0;
        // n = Entrada.entero(n,mens);
        n = (int) (Math.random() * 10000) + 1;
        System.out.println("Empezó el juego...");
        num = Entrada.entero(n, mens);
        while (n != num) {
            if (n > num)
                System.out.println(mens0);
            else
                System.out.println(mens1);
            cont++;
            num = Entrada.entero(n, mens);
        }
        System.out.println("Tuviste " + cont + " intentos.");
        return n;
    }
}

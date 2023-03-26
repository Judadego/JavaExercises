package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje3 {
    public static void main(String []Args) {
        par();
    }
    public static void par() {
        System.out.println("Para finalizar el programa ingresa 0.");
        inicio();
        System.out.println("Haz finalizado el programa :)");
    }

    public static void inicio() {
        int a = 0;
        String mens = " Ingresa un numero para determinar si es par o impar.";
        a = Entrada.entero(a, mens);
        while (a != 0 ){
            a = a % 2;
            if (a == 0)
                System.out.println("El numero es par.");
            else
                System.out.println("El numero es impar.");
            a = Entrada.entero(a, mens);
        }
    }
}

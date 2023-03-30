package Bol_2_Condicionales_y_bucles;

import Bol_1_varables_y_condicionales.bol_1eje22;
import Entrada.Entrada;

public class Adivina {
    public static void main(String[] Args) {
        adivina2();
    }

    public static void adivina2() {
        int num = 0;
        int min = 0;
        int max = 0;
        int err = 0;
        int adivina = 0;
        int opcion = 3;
        int intentos = 0;
        String intentosC = "";
        String mens1 = "ingresa la opcion:";
        System.out.println("Juego Adivina2.");
        System.out.println("Juego donde piensas un número y la pc lo adivinará.");
        while (max <= min || max <= 0 || min <= 0 || num < 0) {
            System.out.println("Debe ser mayores a CERO");
            num = Entrada.entero("Ingresa tu numero, prometo que no lo voy a ver...");
            min = Entrada.entero("Ingresa el número minimo del rango en que está tu numero.");
            max = Entrada.entero("Ingresa el número máximo del rango. ");
            if (max < min) {
                System.out.println("____________________________________________");
                System.out.println("El máximo no puede ser menor que " + min + ".");
                System.out.println("Intenta ingresar el rango otra vez.");
                System.out.println("____________________________________________");
            }
        }
        while (opcion != 1) {
            opcion = 3;
            adivina = (int) (Math.random() * max) + 1;
            while (adivina > max || adivina < min)
                adivina = (int) (Math.random() * max) + 1;
            System.out.println("Creo que tu numero es " + adivina);

            System.out.println("Si es correcto ingresa 1, si es mayor ingresa 2 y si es menor ingresa 0.");
            while (opcion < 0 || opcion > 2)
                opcion = Entrada.entero(mens1);

            if (opcion == 0) {
                if (adivina < min) {

                } else if (adivina == min) {
                    max = adivina;
                    err++;
                } else
                    max = adivina - 1;

            } else if (opcion == 2) {
                if (adivina > max) {

                } else if (adivina == max) {
                    min = adivina;
                    err++;
                } else
                    min = adivina + 1;
            }
            intentos++;

            if (max < min) {
                System.out.println("No hagas trampa pendeja... ");
                opcion = 1;
                if (adivina == num)
                    System.out.println("creo que tu numero ya lo adiviné jaja");

                System.out.println("Porqué no eres sinser@ conmigo ;( !! ");
            }
            if (err > 3) {
                System.out.println("¿Me estás ocultando algo?");
                err = Entrada.entero("1 = si, 2 = NO *sudando* ");
                opcion = 1;
                if (err == 1) {
                    System.out.println("Lo sabía. *cara enojada*");
                    opcion = Entrada.entero("¿Quieres ingresar nuevamente los rangos? " +
                            " Si = 1" + " NO = 0 ");
                    if (opcion == 1) {
                        while (max <= min || max <= 0 || min <= 0 || num < 0) {
                            System.out.println("Debe ser mayores a CERO");
                            min = Entrada.entero("Ingresa el número minimo del rango en que está tu numero.");
                            max = Entrada.entero("Ingresa el número máximo del rango. ");
                            if (max < min) {
                                System.out.println("____________________________________________");
                                System.out.println("El máximo no puede ser menor que " + min + ".");
                                System.out.println("Intenta ingresar el rango otra vez.");
                                System.out.println("____________________________________________");
                            }
                            opcion = 3;
                            err = 0;
                        }
                    } else {
                        System.out.println("Chao ;c");
                        return;
                    }
                } else {
                    System.out.println("Sospechoso... jum...");
                }
            }
        }
        if (intentos >= 0 && intentos <= 99)
            intentosC = bol_1eje22.numStr(intentos);
        else
            intentosC = "" + intentos;
        if (err <= 1) {
            System.out.println("Excelente!! he realizado " + intentosC + " intentos.");
        }

    }
}

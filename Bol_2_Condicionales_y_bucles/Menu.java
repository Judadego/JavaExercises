package Bol_2_Condicionales_y_bucles;

import Bol_1_varables_y_condicionales.bol_1eje22;
import Entrada.Entrada;

public class Menu {
    public static void main(String[] Args) {
        System.out.println("Bienvenid@ a este programa, elige la opcion que deseas usar. ");
        System.out.println("Para finalizar escribe 0");
        int opcion = 100;
        int conf = 0;
        inicio(opcion,conf);
        System.out.println("Final definitivo XD.");
    }

    public static void inicio(int opcion, int conf) {
        String mens = "Ingresa una opción.";
        String mens1 = "";
        while (opcion > 0) {
            if (conf <= 0 ) {
                System.out.println("Elige una opcion: ");
                System.out.println("1. Mostrar el cuadrado de un número.");
                System.out.println("2. Mostrar si un número es negativo o positivo.");
                System.out.println("3. Mostrar si un número es par o impar.");
                System.out.println("4. Contar los numeros ingresados.");
                System.out.println("5. Juego. Adivina el número.");
                System.out.println("6. Sumar numeros positivos.");
                System.out.println("7. Hallar la media.");
                System.out.println("8. Mostrar los numeros de 1 a N.");
                System.out.println("9. Mostar los numeros de 100 al 0 de 7 en 7.");
                System.out.println("10. Sumar 15 numeros.");
                System.out.println("11. Numero a palabra.");
                System.out.println("12. Juego Adivinaso.");
                System.out.println("13. Hallar el factorial de un numero menor o igual a 12 ");
                System.out.println("0. Salir del menú.");

                opcion = Entrada.entero(mens);
            }
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    Eje1.cuadrado();
                    break;
                case 2:
                    Eje2.positivo();
                    break;
                case 3:
                    Eje3.par();
                    break;
                case 4:
                    Eje4.conteo();
                    break;
                case 5:
                    Eje5.adivinaNum();
                    break;
                case 6:
                    Eje6.suma();
                    break;
                case 7:
                    Eje7.media();
                    break;
                case 8:
                    Eje8.numeros();
                    break;
                case 9:
                    Eje9.cont100X7v2();
                    break;
                case 10:
                    Eje10.suma15();
                    break;
                case 11:
                    bol_1eje22.inicio();
                    break;
                case 12:
                    Adivina.adivina2();
                    break;
                case 13:
                    Eje12.factorial();
                    break;
                default:
                    System.out.println("Pronto mas opciones...");
                    break;
            }
            if (opcion != 0){
                mens1 = ("¿Quieres repetir? Si = 1, No = 0");   
                conf = 2;
                while (conf != 0 && conf != 1){
                    conf = Entrada.entero(mens1);
                    if (conf != 0 && conf != 1)
                        System.out.println("Opcion no válida. " );
                }
            }

                
        }
    }
}

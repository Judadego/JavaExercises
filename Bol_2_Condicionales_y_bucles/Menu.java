package Bol_2_Condicionales_y_bucles;

import Bol_1_varables_y_condicionales.bol_1eje22;
import Entrada.AFrases;
import Entrada.Entrada;

public class Menu {
    public static void main(String[] Args) {
        menu();
    }
    private static void menu (){
        System.out.println(frase("033"));
        System.out.println(frase("034"));
        int opcion = 100;
        int conf = 0;
        inicio(opcion, conf);
        System.out.println(frase("035"));
    }

    private static String frase(String clave) {
        String frase;
        frase = AFrases.oFrase(clave);
        return frase;
    }

    private static void print(String frase) {
        System.out.println(frase);
    }

    public static void inicio(int opcion, int conf) {
        String mens = frase("001");
        String mens1 = "";
        while (opcion > 0) {
            if (conf <= 0) {
                print(frase("036"));
                print(frase("037"));
                print(frase("038"));
                print(frase("039"));
                print(frase("040"));
                print(frase("041"));
                print(frase("042"));
                print(frase("043"));
                print(frase("044"));
                print(frase("045"));
                print(frase("046"));
                print(frase("047"));
                print(frase("048"));
                print(frase("049"));
                print(String.format(frase("050"),
                        AFrases.oParm("001")));
                print(frase("051"));

                opcion = Entrada.entero(mens);
            }
            switch (opcion) {
                case 0:
                    opcion = Entrada.entero(frase("055") +  
                                            frase("056"));
                    if (opcion == 1) {
                        opcion = 0;
                        break;
                    } else{
                        opcion = 100;
                        break;
                    }
                
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
                case 14:
                    CienAnios.cienAnios();
                    break;
                default:
                    print(frase("052"));
                    break;
            }
            if (opcion != 0 ) {
                mens1 = (frase("053"));
                conf = 2;
                while (conf != 0 && conf != 1) {
                    conf = Entrada.entero(mens1);
                    if (conf != 0 && conf != 1)
                        print(frase("054"));
                }
            }

        }
    }
}

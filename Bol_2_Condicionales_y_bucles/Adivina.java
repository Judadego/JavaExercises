package Bol_2_Condicionales_y_bucles;

import Bol_1_varables_y_condicionales.bol_1eje22;
import Entrada.AFrases;
import Entrada.Entrada;

public class Adivina {
    public static void main(String[] Args) {
        adivina2();
    }
    
    public static String frase(String clave){
        String fra;
        fra = AFrases.ofrase(clave);
        return fra;
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
        String mens1 = AFrases.oFrase("001");
        //String mens1 = frase("001"); // probar esta modificación, reduce palabras usadas y reutiliza codigo.
        System.out.println(AFrases.oFrase("002"));
        System.out.println(AFrases.oFrase("003"));
        while (max <= min || max <= 0 || min <= 0 || num < 0) {
            System.out.println(AFrases.oFrase("004"));
            num = Entrada.entero(AFrases.oFrase("005"));
            min = Entrada.entero(AFrases.oFrase("006"));
            max = Entrada.entero(AFrases.oFrase("007"));
            if (max < min) {
                System.out.println(AFrases.oFrase("008"));
                System.out.println(String.format(AFrases.oFrase("009"),min));
                System.out.println(AFrases.oFrase("010"));
                System.out.println(AFrases.oFrase("008"));
            }
        }
        while (opcion != 1) {
            opcion = 3;
            adivina = (int) (Math.random() * max) + 1;
            while (adivina > max || adivina < min)
                adivina = (int) (Math.random() * max) + 1;
            System.out.println(String.format(AFrases.oFrase("011"),adivina));
            //System.out.println(String.format(frase("011"),adivina));

            System.out.println(String.format(AFrases.oFrase("012"),1,2,0));
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
                System.out.println(AFrases.oFrase("016"));
                opcion = 1;
                if (adivina == num)
                    System.out.println(AFrases.oFrase("017"));

                System.out.println(AFrases.oFrase("018"));
            }
            if (err > 3) {
                System.out.println(AFrases.oFrase("019"));
                err = Entrada.entero(String.format(AFrases.oFrase("020"),1,0));
                opcion = 1;
                if (err == 1) {
                    System.out.println(AFrases.oFrase("021"));
                    opcion = Entrada.entero(AFrases.oFrase("021"));
                    if (opcion == 1) {
                        while (max <= min || max <= 0 || min <= 0 || num < 0) {
                            System.out.println(AFrases.oFrase("023"));
                            min = Entrada.entero(AFrases.oFrase("024"));
                            max = Entrada.entero(AFrases.oFrase("007"));
                            if (max < min) {
                                System.out.println(AFrases.oFrase("008"));
                                System.out.println(String.format(AFrases.oFrase("009"),min));
                                System.out.println(AFrases.oFrase("010"));
                                System.out.println(AFrases.oFrase("008"));
                            }
                            opcion = 3;
                            err = 0;
                        }
                    } else {
                        System.out.println(AFrases.oFrase("025"));
                        return;
                    }
                } else {
                    System.out.println(AFrases.oFrase("026"));
                }
            }
        }
        if (intentos >= 0 && intentos <= 99)
            intentosC = bol_1eje22.numStr(intentos);
        else
            intentosC = "" + intentos;
        if (err <= 1) {
            System.out.println(String.format(AFrases.oFrase("027"),intentosC));
        }

    }
}

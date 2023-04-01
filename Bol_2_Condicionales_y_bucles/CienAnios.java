package Bol_2_Condicionales_y_bucles;

import java.time.LocalDate;

import Entrada.*;

public class CienAnios {
    public static void main(String[] Args) {
        cienAnios();
    }

    private static String frase (String clave){
        String frase;
        frase = AFrases.oFrase(clave);
        return frase;
    }

    public static void cienAnios() {
        String nombre;
        int edad = 0;
        // System.out.println(AFrases.oFrase("028")); // para probar el comentariado es
        // necesario reemplazar en el Frases.json 100 por %d
        System.out.println(String.format(frase("028"), AFrases.oParm("001")));
        nombre = Entrada.string(frase("029"));
        while (edad <= 0) {
            edad = Entrada.entero(String.format(frase("030"), nombre));
            if (edad <= 0)
                System.out.println(frase("031"));
        }
        edad = cumplir(edad);
        System.out.println(String.format(frase("032"), nombre, AFrases.oParm("001"), edad));
    }

    public static int cumplir(int edad) {
        int year;
        // int cien = 100;
        int cien = AFrases.oParm("001");
        LocalDate dt = LocalDate.now();
        year = dt.getYear();
        edad = year + (cien - edad);
        return edad;
    }
}

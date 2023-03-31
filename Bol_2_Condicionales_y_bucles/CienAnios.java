package Bol_2_Condicionales_y_bucles;

import java.time.LocalDate;

import Entrada.*;

public class CienAnios {
    public static void main(String[] Args) {
        cienAnios();
    }

    public static void cienAnios() {
        String nombre;
        int edad = 0;
        System.out.println(AFrases.oFrase("028"));
        nombre = Entrada.string(AFrases.oFrase("029"));
        while (edad <= 0) {
            edad = Entrada.entero(String.format(AFrases.oFrase("030"),nombre));
            if (edad <= 0)
                System.out.println(AFrases.oFrase("031"));
        }
        edad = cumplir(edad);
        System.out.println(String.format(AFrases.oFrase("032"),nombre,edad));
    }

    public static int cumplir(int edad) {
        int year;
        int cien = 100;  
        // int cien = AFrases.oParm("001");
        LocalDate dt = LocalDate.now();
        year = dt.getYear();
        edad = year + (cien - edad);
        return edad;
    }
}

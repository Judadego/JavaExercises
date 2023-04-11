package Bol_2_Condicionales_y_bucles;

import Entrada.*;

public class Eje14 {
    public static void main(String[] Args) {
        sueldos();
    }

    public static void sueldos() {
        int sueldo;
        int suma = 0;
        int cont = 0;
        System.out.println(String.format(AFrases.oFrase("061"),
                AFrases.oParm("003"),
                AFrases.oParm("002")));

        for (int i = 1; i <= AFrases.oParm("003"); i++) {
            sueldo = Entrada.entero(i + AFrases.oFrase("062"));
            suma = suma + sueldo;
            if (sueldo > AFrases.oParm("002")) {
                cont++;
            }
        }
        System.out.println(AFrases.oFrase("063") + suma);
        System.out.println(String.format(AFrases.oFrase("064"),cont));
    }
}

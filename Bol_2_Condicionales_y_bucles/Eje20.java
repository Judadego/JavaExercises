package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje20 {
    public static void main(String [ ]Args) {

        int numSueldos = 0;
        float sueldo = (float) 0.0;
        float sueldoMa = 0.0f;

        numSueldos = Entrada.entero("Ingresa la cantidad de sueldos: ");

        for (int i = 0; i < numSueldos; i++) {
            sueldo = Entrada.entero("Ingresa el sueldo n° " + (i + 1));
            if (sueldo > sueldoMa) {
                sueldoMa = sueldo;
            }
        }
        System.out.println("El sueldo mayor es "+ sueldoMa);
    }
}

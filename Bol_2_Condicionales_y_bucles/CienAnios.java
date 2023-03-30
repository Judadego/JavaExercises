package Bol_2_Condicionales_y_bucles;

import java.time.LocalDate;
import java.util.Scanner;

import Entrada.Entrada;

public class CienAnios {
    public static void main(String[] Args) {
        cienAnios();
    }

    public static void cienAnios() {
        String nombre;
        int edad = 0;
        System.out.println("Programa paara determinar cuando cumples cien años...");
        nombre = Entrada.string("Ingresa tu nombre: ");
        while (edad <= 0) {
            edad = Entrada.entero(nombre + ", ingresa tu edad: ");
            if (edad <= 0)
                System.out.println("Ingresa una edad válida:");
        }
        edad = cumplir(edad);
        System.out.println("Hola " + nombre + "!, cumplirás 100 años en el año " + edad);
    }

    public static int cumplir(int edad) {
        int year;
        int cien = 100;
        LocalDate dt = LocalDate.now();
        year = dt.getYear();
        edad = year + (cien - edad);
        return edad;
    }
}

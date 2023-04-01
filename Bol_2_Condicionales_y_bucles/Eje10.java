package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje10 {
    public static void main(String [] Args) {
        suma15();
    }
    public static void suma15(){
        int sum = 0;
        System.out.println("ingresa 15 numeros para sumarlos.");    
        for (int num = 1 ; num <= 15 ; num ++){
            String mens = num + ". Ingresa un número.";
            sum = sum + Entrada.entero(mens);
        }
        System.out.println("_______________________________");
        System.out.println("El resultado de la suma es: "+ sum +".");
    }
}

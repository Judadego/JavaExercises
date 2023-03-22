package Bol_1_varables_y_condicionales;

import java.util.Scanner;

public class bol_1_eje14 {
    public static void main (String [ ] Args){
        Integer a;
        String valida = "";
        String mens = "La nota es: ";

        System.out.println("Ingresa una nota de 0 a 10 para validar si es");
        System.out.println("aprobado o reprobado: ");
        try{
            Scanner A = new Scanner(System.in);
            a = A.nextInt();
            A.close();
        }catch(Exception ex){
            mens = "Error. Solo debe ingresar numeros.";
            System.out.println(mens);
            return;
        }
        if (a < 6 && a >= 0 && a <= 10){
            valida = "reprobado";
        }else if (a >=6 && a <= 10 ){
            valida = "aprobado";
        }else{
            mens="Error. La nota debe ser entre 0 y 10.";
        }
        System.out.println(mens + valida);
    }
}

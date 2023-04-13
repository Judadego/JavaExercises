package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje15 {
public static void main (String [] Args ) {
    estaturas();
}

    public static void estaturas() {
        int estatura, edad, sumEst, sumEdad, 
         sum175, contEst ;
        int mediaEdad , mediaEst, contEdad;
        sumEdad = 0;
        sumEst = 0;
        sum175 = 0;
        contEst =0 ;
        contEdad =0;

        System.out.println("ingresa la edad y la estatura de 5 Alumnos");

        for (int i = 1 ; i <= 5 ; i++){
            estatura = Entrada.entero(i + ". Ingresa la estatura: ");
            edad =Entrada.entero(i + ". Ingresa la edad: ");
            sumEdad = sumEdad + edad;
            contEst ++;
            sumEst = sumEst + estatura;
            if (estatura > 175 ){
                sum175 ++;
            }
            if (edad > 18 ){
                contEdad++;
            }
        }
        
        mediaEdad = sumEdad / contEst ;
        mediaEst = sumEst / contEst;
        System.out.println("La media de la edad es: " + mediaEdad);
        System.out.println("La media de la estatura es: "+ mediaEst);
        System.out.println("El numero de alumnos mayores a 18 años es: " + contEdad);
        System.out.println("La cantidad de alumnos con mas de 1.75m de altura: " + sum175);

    }
}

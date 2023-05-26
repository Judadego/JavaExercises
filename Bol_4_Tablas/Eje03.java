package Bol_4_Tablas;

import Entrada.Entrada;

public class Eje03 {
    public static void main(String[] Args) {
        int result [];
        result = new int[3];
        result = media();
        System.out.println("La media de los positivos es : " + result[0]);
        System.out.println("la media de los negativos: " + result[1]);
        System.out.println("La media de los ceros son: " + result[2]);
    }

    /**
     * metodo para tomar 5 numeros ingresados por consola,
     * se toma la media de los numeros ingresados positivos
     * negativos y ceros ingresados 
     * @return
     * List[0] = Media de los positivos
     * List[1] = media de los negativos
     * List[2] = media de los ceros 
     */
    public static int[] media() {
        int list[];
        int result [];
        int contP = 0 ;
        int contN = 0 ;
        int contC = 0 ;
        list = new int[5];
        result = new int [3];
        for (int i = 0; i < 5; i++) {
            list[i] = Entrada.entero((i+1)+". Ingresa un numero: ");
            if (list[i] > 0 ){
                result[0] = result[0] + list[i];
                contP ++;                
            }
            else if ( list[i] < 0 ){ 
                result[1] = result[1] + list[i];
                contN ++;
            }
            else{
                result[2] = result[2] + list[i];
                contC ++;
            }
        }
        if (result[0] != 0 )    
            result[0] = result[0]/ contP;
        if (result[1] != 0 ) 
            result[1] = result[1] / contN;
        if (contC != 0 ) 
            result[2] = contC;
        return result;
    }
}

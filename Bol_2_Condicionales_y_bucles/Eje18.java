package Bol_2_Condicionales_y_bucles;

import Entrada.Entrada;

public class Eje18 {
    public static void main(String [] Args) {
        factura();
    }
    public static void factura() {
        int cod =0;
        float cantL=0;
        float precio;
        int numFact=0;
        float total=0;
        float total1=0;
        float totLitros=0;
        int cantFact =0;
        System.out.println("Programa para mostrar la facturacion total. ");
        numFact = Entrada.entero("Cuantas facturas vas a ingresar?");

        for (int i = 0; i < numFact ; i++ ){
            System.out.println("Factura N° " + (i+1));
            cod = Entrada.entero((i+1) +". Ingresa el codigo: ");
            cantL = Entrada.entero((i+1) + ". Ingresa la cantidad de litros: ");
            //precio = Entrada.entero((i+1) + ". Ingresa el precio por litro: ");   
            if (cod == 1 ) {
                precio = (float) 0.6;
                totLitros = totLitros + cantL;
                total = total + (precio * cantL);
                total1 = precio * cantL;
            }else if (cod == 2 ){
                precio = (float) 3.0;
                totLitros = totLitros + cantL;
                total = total + (precio * cantL);
                total1 = precio * cantL;
            }else if(cod ==3){
                precio =  1.5f;
                totLitros = totLitros + cantL;
                total = total + (precio * cantL);
                total1 = precio * cantL;
            }
            if (total1 > 600 ){
                cantFact ++;
            }            
        }

        System.out.println("Total Facturado: " + total);
        System.out.println("Cantidad en litros: "+ totLitros);
        System.out.println("Facturas que superan los 600 Euros: "+ cantFact);

    }
}

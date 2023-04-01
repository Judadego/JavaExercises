package Bol_2_Condicionales_y_bucles;

public class Eje11 {
    public static void main (String [] Args){
        producto();
    }
    public static void producto() {
       long producto = 1;
        for (int i = 1; i<20; i+=2){
            producto = producto * i;
        }
        System.out.println("La multiplicaión de los 10 primeros impares: " + producto);
    }
}

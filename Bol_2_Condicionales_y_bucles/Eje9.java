package Bol_2_Condicionales_y_bucles;

public class Eje9 {
    public static void main(String [] Args) {
        cont100X7v2();
    }
    public  static void cont100X7() {
        int cien = 100;
        while (cien > 0){
            System.out.println(cien);
            cien = cien - 7;
        }
    }
    public  static void cont100X7v2() {
        for (int i = 100 ; i >= 0; i -= 7){
            System.out.println(i);
        }
    }
}

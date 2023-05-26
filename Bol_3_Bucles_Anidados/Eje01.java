package Bol_3_Bucles_Anidados;

public class Eje01 {
    public static void main(String[] args) {
        int suma;
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                suma = i * 10 + j;
                System.out.println(suma);
            }
        }
    }
}

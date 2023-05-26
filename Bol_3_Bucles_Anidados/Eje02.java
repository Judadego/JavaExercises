package Bol_3_Bucles_Anidados;

public class Eje02 {
    public static void main(String[] args) {
        int j;
        for (int i = 0; i < 3; i++) {
            j = i + 1;
            while (j < 4) {
                System.out.println(j - i);
                j++;
            }
        }
    }
}

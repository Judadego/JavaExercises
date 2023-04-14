package Bol_3_Bucles_Anidados;

public class Eje03 {
    public static void main(String []Args){
        tablas();
    }

    public static void tablas(){
        for (int i = 1; i<= 10 ; i++){
            System.out.println("___________________________");
            for (int j =1 ; j<=10;j++){
                System.out.println(i + " x " + j +" = " + (i*j));
            }
        }
    }
}

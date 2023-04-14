package Bol_3_Bucles_Anidados;

public class Eje05 {
    public static void main(String[] Args) {
        contador();
    }

    public static void contador() {
        String uno, dos, tres, cuatro, cinco;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            uno = tresE(m);
                            dos = tresE(l);
                            tres = tresE(k);
                            cuatro = tresE(j);
                            cinco = tresE(i);
                            System.out.println(cinco + "-" + cuatro + "-" + tres + "-" + dos + "-" + uno);
                        }
                    }
                }
            }
        }
    }

    public static String tresE(int m) {
        String uno = "";
        if (m == 3)
            uno = "E";
        else
            uno = Integer.toString(m);
        return uno;
    }
}

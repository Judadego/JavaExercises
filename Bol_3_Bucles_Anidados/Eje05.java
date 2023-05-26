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

    /**
     * @param int
     * ingresa un numero si es igual a tres se devuelve la letra "E" 
     * sino devuelve "3" de tipo String
     * @return (String e)
     */
    public static String tresE(int m) {
        String e = "";
        if (m == 3)
            e = "E";
        else
            e = Integer.toString(m);
        return e;
    }
}

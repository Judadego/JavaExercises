package Entrada;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AFrases {

    private static final String ARCHIVO_FRASES = "Frases.json";

    public static String oFrase(String clave) {
        String frase = null;
        try {
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(new FileReader(ARCHIVO_FRASES));
            frase = (String) json.get(clave);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return frase;
    }
    
    public static final String ARCHIVO_PARM = "Parm.json";
    
    public static int oParm(String clave){
        int num = 0;
        try {
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(new FileReader(ARCHIVO_PARM));
            num = Integer.parseInt((String) json.get(clave));
        } catch (IOException | ParseException e ){
            e.printStackTrace();
        }
        return num;
    }
}

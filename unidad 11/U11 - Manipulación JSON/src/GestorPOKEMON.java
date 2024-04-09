import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class GestorPOKEMON {
    public static void main(String[] args) throws Exception {
        GestorPOKEMON gestor = new GestorPOKEMON();
        gestor.importarJSON("./src/pokedex.json");
      }
      @SuppressWarnings("unchecked")
      public void importarJSON(String nombreFichero) {
        try {
          JSONParser parser = new JSONParser();
          Reader reader = new FileReader(nombreFichero);
          Object jsonObj = parser.parse(reader);
          JSONObject jsonObject = (JSONObject) jsonObj;

          Long id = (Long) jsonObject.get("id");
          String nombre = (String) jsonObject.get("name");
          Long weight = (Long) jsonObject.get("weight");


          JSONArray arrayTipos = (JSONArray) jsonObject.get("type");
          System.out.println("Tipo: " + arrayTipos);
          System.out.println("Identificador: " + id);
          System.out.println("Nombre: " + nombre);
          System.out.println("Edad: " + weight);
    JSONArray arrayPokemons = (JSONArray) jsonObject.get("pokemon");
    arrayPokemons.forEach(entry -> {
        JSONObject pokemon = (JSONObject) entry;
        System.out.println(pokemon.get("Tipo"));
        System.out.println(pokemon.get("id"));
        System.out.println(pokemon.get("nombre"));
    });
    
reader.close();
} catch (Exception ex) {
ex.printStackTrace();
}
      }}
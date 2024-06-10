import java.io.FileReader;
import java.io.Reader;
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
          String candy = (String) jsonObject.get("candy");

    JSONArray arrayPokemons = (JSONArray) jsonObject.get("pokemon");
    arrayPokemons.forEach(entry -> {
        JSONObject pokemon = (JSONObject) entry;
        System.out.println("Id: " + pokemon.get("id"));
        System.out.println("Nombre: "+ pokemon.get("name"));
        System.out.println("Peso: "+ pokemon.get("weight"));
        System.out.println("Caramelo: "+ pokemon.get("candy"));
    });
    
reader.close();
} catch (Exception ex) {
ex.printStackTrace();
}
      }}
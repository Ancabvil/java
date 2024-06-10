/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePokemon;

/**
 *
 * @author cabre
 */
import java.util.ArrayList;
import java.io.FileReader;
import java.io.Reader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class GestorPokemon {

    ArrayList<Pokemon> pokemon = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public void importarJSON(String nombreFichero) {
        try {
            JSONParser parser = new JSONParser();
            Reader reader = new FileReader(nombreFichero);
            Object jsonObj = parser.parse(reader);
            JSONObject jsonObject = (JSONObject) jsonObj;

            JSONArray arrayPokemons = (JSONArray) jsonObject.get("pokemon");
            arrayPokemons.forEach(entry -> {
                JSONObject pokemonObj = (JSONObject) entry;
                Long id = (Long) pokemonObj.get("id");
                String nombre = (String) pokemonObj.get("name");
                JSONArray tipos = (JSONArray) pokemonObj.get("type");
                Long peso = (Long) pokemonObj.get("weight");

                System.out.println("ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Tipos: " + tipos);
                System.out.println("Peso: " + peso);

                // Aquí podrías crear objetos Pokemon y añadirlos a tu lista de pokemon
            });

            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

      
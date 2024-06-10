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

public class Pokemon {

  public void importarJSON(String nombreFichero) {
        try {
            JSONParser parser = new JSONParser();
            Reader reader = new FileReader(nombreFichero);
            Object jsonObj = parser.parse(reader);
            JSONObject pokedex = (JSONObject) jsonObj;

            // Iteramos sobre la Pokédex
            for (Object key : pokedex.keySet()) {
                String pokemonId = (String) key;
                JSONObject pokemon = (JSONObject) pokedex.get(pokemonId);

                // Leemos los detalles del Pokémon
                Long id = (Long) pokemon.get("id");
                String name = (String) pokemon.get("name");
                String type = (String) pokemon.get("type");
                Long weight = (Long) pokemon.get("weight");

                // Imprimimos los detalles del Pokémon
                System.out.println("ID: " + id);
                System.out.println("Nombre: " + name);
                System.out.println("Tipo: " + type);
                System.out.println("Peso: " + weight);
                System.out.println();
            }

            // Cerramos el lector
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

      
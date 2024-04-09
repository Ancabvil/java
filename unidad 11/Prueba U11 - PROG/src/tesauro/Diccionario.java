package tesauro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Diccionario implements Serializador {

  private HashMap<String, ArrayList<String>> glosario;

  public Diccionario() {
    glosario = new HashMap<String, ArrayList<String>>();
  }

  /**
   * @param palabraInglés Se pide la palabra en ingles
   * @param significadoEspañol Se pide un significado de la palabra en inglés anterior
   */
  public void añadirEntrada(String palabraInglés, String significadoEspañol) {
    if (glosario.containsKey(palabraInglés)) {
      if (!glosario.get(palabraInglés).contains(significadoEspañol)) glosario
        .get(palabraInglés)
        .add(significadoEspañol);
    } else {
      ArrayList<String> significado = new ArrayList<String>();
      significado.add(significadoEspañol);
      glosario.put(palabraInglés, significado);
    }
  }

  /**
   * @param palabraInglés Se pide la palabra en inglés para borrarla completamente del diccionario.
   */
  public void eliminarEntrada(String palabraInglés) {
    glosario.remove(palabraInglés);
  }

  /**
   * @param palabraInglés Se pide la palabra en inglés
   * @param significadoEspañol Se pide el significado que quiere borrarse de la palabra en inglés
   */
  public void eliminarSignificado(
    String palabraInglés,
    String significadoEspañol
  ) {
    if (glosario.containsKey(palabraInglés)) {
      glosario.get(palabraInglés).remove(significadoEspañol);
    }
  }

  /**
   * @param palabraInglés Se pide la palabra en inglés para saber sus significados.
   * @return Devuelve los significados de la palabra enviada.
   */
  public ArrayList<String> consultar(String palabraInglés) {
    if (glosario.containsKey(palabraInglés)) {
      return glosario.get(palabraInglés);
    } else {
      return new ArrayList<String>();
    }
  }

  /**
   * Añade datos desde un fichero
   * @param nombreFichero
   */
  public void importar(String nombreFichero) {
    // TODO Leer desde un fichero nuevas entradas para incorporarlas al glosario
    // Puedes utilizar 'añadirEntrada' para añadir las entradas leídas
    // Deserializa cada línea del fichero antes
    // Cada entrada estará en una línea distinta del fichero
    String linea="";
      try {
      BufferedReader bf = new BufferedReader(new FileReader(linea));
      BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero));
     while (linea.length() != 0) {
      añadirEntrada(nombreFichero, linea);
      bf.readLine();
      deserializar(linea);
      bw.write(linea);
      bw.newLine();
     }
      bf.close();
      bw.close();
    } catch (IOException io) {
      System.out.println("No se encuentra la entrada");
    }
    }

  /**
   * Exporta los datos actuales del diccionario a un fichero
   * @param nombreFichero
   */
  public void exportar(String nombreFichero) {
    // TODO Escribir sobre un fichero el contenido completo del glosario
    // Puedes utulizar keySet() sobre el glosario para obtener el conjunto de claves
    // Serializa cada entrada antes de escribirla en el fichero
    // Cada entrada estará en una línea nueva
    String linea = "";
    try {
    BufferedReader br = new BufferedReader(new FileReader(linea));
    BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero, true));
    while (nombreFichero.length() != 0) {
      br.readLine();
      deserializar(linea);
      bw.write(linea);
      bw.newLine();    
      br.close();
      bw.close();
    }  
    }catch (IOException io) {
      System.out.println("No se puede exportar el archivo");
    }
    
    
  }

  public int númeroEntradas() {
    // TODO Devolver el tamaño del glosario (o número de entradas)
    String linea = "";
    try {
      BufferedReader bf = new BufferedReader(new FileReader(linea));
if (glosario.size() != 0) {
    deserializar(linea);
    glosario.get(bf);
}
bf.close();
    
    } catch (IOException ioe) {
      // TODO: handle exception
      System.out.println("No se puede mostrar el tamaño del glosario");
    }
    return 0;
  }

  /**
   * @param palabraInglés palabra en inglés
   * @param significados lista con las acepciones en castellano de la palabra inglesa
   * @return cadena de caracteres conteniendo los datos de la entrada del diccionario
   */
  @Override
  public String serializar(
    String palabraInglés,
    ArrayList<String> significados
  ) {
    return String.format(palabraInglés).concat(";" + significados);
  }

  /**
   * @param líneaFichero datos en el fichero de una entrada del diccionario
   * @return array de Strings con la palabra en inglés en primera posición seguida de los signficados en español.
   */
  @Override
  public String[] deserializar(String líneaFichero) {
    String[] significados = líneaFichero.split(";");
    for (String string : significados) {
    }
    return deserializar(líneaFichero);
  }
}

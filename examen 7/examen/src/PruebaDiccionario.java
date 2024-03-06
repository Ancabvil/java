/**
 * @author Antonio Manuel Cabrera Villarejo
 * 
 * @param opcion se usa para controlar el menú
 * @param diccionario es el nombre del hashmap donde almacenámos las palabras
 * @param word controla las palabras que se le quieran agregar
 * @param meaning es el significado de la palabra
 * @param borraPalabra almacena la palabra para luego borrarla
 * @param selecPalabra almacena la acepción para la palabra
 * @param borrarAcep almacena la acepción que quieres borrar
 * 
 * 
 */


import java.util.ArrayList;
import java.util.HashMap;

public class PruebaDiccionario {
    public static void main(String[] args) throws Exception {
    
        //Aquí creo un hashmap de String y un arraylist de string, he intentado hacerlo de objetos pero no ha habido manera
        HashMap<String , ArrayList<String>> diccionario = new HashMap<>();

        int opcion;
        do {
        System.out.println("Diccionario Ingles - Español");
        System.out.println("1. Consultar diccionario");
        System.out.println("2. Añadir entrada al diccionario");
        System.out.println("3. Borrar entrada del diccionario");
        System.out.println("4. Borrar significado del diccionario");
        System.out.println("5. Salir");
        
                //aquí creo un menu para controlar las entradas y salidas además de añadir el try catch para las excepciones
        opcion =Integer.parseInt(System.console().readLine()) ;
        try {
            
            switch (opcion) {
                case 1:

                System.out.println("Selecciona la palabra que quieres ver:");
                String word = System.console().readLine();
                //aquí compruebo que la palabra esté o no en el diccionário y en caso afirmativo la añado
                if (diccionario.containsKey(word)) {
            
                    for (String palabra : diccionario.keySet() ) {
                        System.out.println("Palabra en Inglés: ");
                        System.out.println(word + " ");
                
                        for (String meaning : diccionario.get(palabra)) {
                        System.out.println("Significados: ");
                        System.out.println(meaning);
                        }
            
                }
            
                }else{
                    System.out.println("La palabra no existe en el diccionario.");
                }
                break;
                //Aquí añado palabras al diccionario comprobando que si la palabra existe previamente le añada un valor al
                //arraylist de string o directamente cree una nueva palabra y acepción de la misma
                    case 2:
                    System.out.println("Introduce una palabra en Inglés: ");
                    word = System.console().readLine();
                    System.out.println("Introduce una acepción:");
                    String meaning = System.console().readLine();
                    if (diccionario.containsValue(word)) {
                    diccionario.get(word).add(meaning);
                    } else{
                    ArrayList<String> meanings = new ArrayList<>();
                    meanings.add(meaning);
                    diccionario.put(word, meanings);
                    }
    
                    break;

                    //Aquí comprobamos que las palabras esten en el diccionario, de no estar arrojamos un mensaje de error
                    case 3:
                    System.out.println("Introduzca la entrada que quiere borrar:");
                    String borraPalabra = System.console().readLine();
                    if (diccionario.containsValue(borraPalabra)) {
                        diccionario.remove(borraPalabra);
                        System.out.println("La palabra y sus significados han sido borrados");
                    } else{
                        System.out.println("La palabra no estaba en el diccionario.");
                    }
                    break;
                    //Aquí comprobamos que tanto palabra como acepción se encuentren en el hashmap para borrarlas
                    case 4:
                    System.out.println("Introduzca la palabra:");
                    String selecPalabra = System.console().readLine();
                    System.out.println("Introduzca la acepción que quiere borrar");
                    String borrarAcep = System.console().readLine();
                    if (diccionario.containsKey(selecPalabra) && diccionario.containsValue(borrarAcep)) {
                        diccionario.remove(selecPalabra,borrarAcep);
                    } else if (!diccionario.containsKey(selecPalabra)) {
                        System.out.println("La palabra no se encuentra en el diccionario");
                    } else if (!diccionario.containsValue(borrarAcep)) {
                        System.out.println("La acepción no se encuentra en el diccionario");
                    }
                    break;
                    //Aquí salimos del programa y controlamos con el while que solo salga si la ocpión es 5,
                    //además de añadir una opción default para otros valores numéricos.
                    case 5:
                    System.out.println("Gracias por usar el diccionario.");
                    break;
            
                default:
                System.out.println("La opción no está contemplada");
                    break;
                }
                 
                }
         catch (Exception e) {
            System.out.println("Esa opción no está contemplada");
        }   
            
    }while (opcion!= 5);
}
}  
        
        


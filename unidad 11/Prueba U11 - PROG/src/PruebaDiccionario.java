import java.util.ArrayList;
import java.util.Scanner;
import tesauro.Diccionario;

public class PruebaDiccionario {

  public static void main(String[] args) throws Exception {
if (args.length != 1) {
  System.out.println("El programa necesita un solo argumento.");
  System.exit(-1);
}  

    try {
      // Variables necesarias
      Diccionario diccionario = new Diccionario();
      ArrayList<String> significados;
      Scanner s = new Scanner(System.in);
      int elección;
      String palabraInglés;
      String significadoEspañol;
      // Se crea un do-while para que siga repitiéndose hasta que seleccione salir.
      do {
        System.out.println(
          "Bienvenido al Mini-Diccionario, porfavor seleccione una de estas opciones:"
        );
        System.out.println("(1) Consultar el diccionario.");
        System.out.println("(2) Añadir una entrada al diccionario.");
        System.out.println("(3) Borrar una entrada completa del diccionario.");
        System.out.println(
          "(4) Borrar un significado en castellano del diccionario."
        );
        System.out.println("(5) Importar diccionario desde el fichero.");
        System.out.println("(6) Exportar diccionario actual al fichero.");
        System.out.println("(7) Salir del programa.");
        System.out.print("Opción: ");
        elección = s.nextInt();
        // Con este if se controla que si elige un número que no está entre 1 y 7 salga un mensaje de error
        if (elección > 7 || elección < 1) {
          System.out.println("Por favor, elija una opción válida\n");
        } else {
          // Switch para controlar el menú de elecciones
          switch (elección) {
            case 1: //Consultar
              System.out.println(
                "Para consultar el diccionario, escriba la palabra en inglés que de la que quiere la traducción."
              );
              System.out.print("Por favor, escriba la palabra en inglés: ");
              s.nextLine();
              palabraInglés = s.nextLine();
              // Para controlar si esa palabra existe en el diccionario o no.
              significados = diccionario.consultar(palabraInglés);
              if (significados.isEmpty()) {
                System.out.println(
                  "La palabra no está en el diccionario, si desea añadirla pulse 2.\n"
                );
              } else {
                System.out.println("Significados en español: ");
                for (String significado : significados) {
                  System.out.println("- " + significado);
                }
                System.out.println();
              }
              break;
            case 2: //Añadir
              System.out.println(
                "Para añadir una entrada al diccionario escriba una palabra en inglés y su significado."
              );
              System.out.print("Primero la palabra en inglés: ");
              s.nextLine();
              palabraInglés = s.nextLine();
              System.out.print("Ahora su significado en español: ");
              significadoEspañol = s.nextLine();
              diccionario.añadirEntrada(palabraInglés, significadoEspañol); // Uso de la funcion añadirEntrada
              System.out.println(
                "Muchas gracias por su aportación al diccionario.\n"
              );
              break;
            case 3: //Borrar entrada
              System.out.println(
                "Para borrar una entrada completa, escriba la palabra en inglés que se quiere borrar."
              );
              System.out.print("Por favor, escriba la palabra en inglés: ");
              s.nextLine();
              palabraInglés = s.nextLine();
              significados = diccionario.consultar(palabraInglés);
              if (significados.isEmpty()) {
                System.out.println(
                  "La palabra en inglés no existe en el diccionario.\n"
                );
              } else {
                diccionario.eliminarEntrada(palabraInglés); // Uso de la funcion eliminarEntrada
                System.out.println(
                  "Se ha borrado esa entrada completa. Gracias por su aportación.\n"
                );
              }
              break;
            case 4: //Borrar significado
              System.out.println(
                "Para borrar un significado en castellano, escriba la palabra en inglés y el significado a borrar."
              );
              System.out.print("Primero escriba la palabra en inglés: ");
              s.nextLine();
              palabraInglés = s.nextLine();
              System.out.print(
                "Ahora el significado en español que quiera borrar: "
              );
              significadoEspañol = s.nextLine();
              significados = diccionario.consultar(palabraInglés);
              if (significados.isEmpty()) {
                System.out.println(
                  "Esa palabra no se encuentra en el diccionario.\n"
                );
              } else {
                diccionario.eliminarSignificado(
                  palabraInglés,
                  significadoEspañol
                ); // Uso de la funcion eliminarSignificado
                System.out.println(
                  "Se ha borrado ese significado. Gracias por su aportación.\n"
                );
              }
              break;
            case 5: //Importar desde archivo
              // TODO Invocar al método importar de la clase Diccionario
              // Indicar, con un mensaje, que la importación se realizó con éxito
              Diccionario imporDicc = new Diccionario();
              imporDicc.importar("Lexicón.txt");
              System.out.println("El archivo se importó con exito.");  
              break;
            case 6: //Exportar a archivo
              // TODO Invocar al método exportar de la clase Diccionario
              // Indicar, con un mensaje, que la exportación se realizó con éxito
              // Añadir en Diccionario el método 'númeroEntradas()' 
              // Comprobar, antes de exportar, que el diccionario no está vacío
              // Si estuviese vacío, ofrecer mensaje indicándolo.
              Diccionario exporDicc = new Diccionario();
              exporDicc.exportar("significadoEspañol");
              break;
          }
        }
      } while (elección != 7);
      s.close();
      // Try-catch para controlar que no ponga letras en la elección del menú
    } catch (Exception e) {
      System.out.println(
        "No puede escribir eso, escriba uno de los números que están en el menú."
      );
    }
  }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Lee de dos archivos y los junta en uno.");
        if (args.length != 3) {
            System.out.println("Los argumentos introducidos no son válidos, comprueba que tiene un nombre válido.");
            System.exit(-1);
        }

        try (BufferedReader maiden1 = new BufferedReader(new FileReader(args[0]));
             BufferedReader maiden2 = new BufferedReader(new FileReader(args[1]));
             BufferedWriter b3 = new BufferedWriter(new FileWriter(args[2]))) {

            String linea1 = maiden1.readLine();
            String linea2 = maiden2.readLine();

            while (linea1 != null || linea2 != null) {
                if (linea1 != null) {
                    System.out.println(linea1);
                    b3.write(linea1 + "\n");
                    linea1 = maiden1.readLine();
                }

                if (linea2 != null) {
                    System.out.println(linea2);
                    b3.write(linea2 + "\n");
                    linea2 = maiden2.readLine();
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("No se ha encontrado el fichero");
        } catch (IOException ioe) {
            System.out.println("No se pudo escribir en el fichero");
        }
    }
}

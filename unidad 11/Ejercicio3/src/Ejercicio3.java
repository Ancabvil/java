import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Lee de dos archivos y los junta en uno.");

        try {
            BufferedReader maiden1 = new BufferedReader(new FileReader("maiden1.txt"));
            String linea1 = maiden1.readLine();

            BufferedReader maiden2 = new BufferedReader(new FileReader("maiden2.txt"));
            String linea2 = maiden2.readLine();

            BufferedWriter b3 = new BufferedWriter(new FileWriter("Fear.txt"));

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

b3.close();
maiden1.close();
maiden2.close();

            
        } catch (FileNotFoundException fnf) {
            System.out.println("No se ha encontrado el fichero");
        } catch (IOException ioe){
            System.out.println("No se pudo escribir en el fichero");
        }

    }
}

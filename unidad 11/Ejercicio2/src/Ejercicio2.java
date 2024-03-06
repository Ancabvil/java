import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Lector de ficheros.");

        
        try {
            BufferedReader bf = new BufferedReader(new FileReader("primos.dat"));
            String linea = "";

            while (linea != null) {
                System.out.println(linea);
                linea = bf.readLine();
                
            }
            
bf.close();

        } catch (FileNotFoundException fnf) {
            System.out.println("No se encuentra el archivo.");
        } catch (IOException ioe){
            System.out.println("No se puede leer el archivo.");
        }

    } 



    }


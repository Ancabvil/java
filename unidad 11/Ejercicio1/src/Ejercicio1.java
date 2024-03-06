import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        boolean esPrimo=false;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
            for (int i = 2; i < 500; i++) {
            esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i%j == 0) {
                        esPrimo = false;
                    }
                }
            
                if (esPrimo) {
                    bw.write(i + "\n");
            }
            }
            bw.close();    
        
            
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir el fichero.");
        }
        

    }

}
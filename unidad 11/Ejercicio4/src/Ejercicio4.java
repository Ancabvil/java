import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException; 
import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Ordenar texto alfabéticamente");
        BufferedReader bf = new BufferedReader(new FileReader("Fear.txt"));
        String linea = "";
        BufferedWriter bw = new BufferedWriter(new FileWriter("Ordenado.txt"));

        
        while (linea != null) {
            if(linea !=null){
                bf.readLine();
                

            }

        }


    }
}

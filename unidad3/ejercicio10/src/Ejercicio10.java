import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca cuantos megas quiere pasar a kilobytes");
        
        int megas= s.nextInt();
        int kb = megas * 1000;
        
        System.out.println("El resultado son " + kb + "Kilobytes");
    s.close();
    
    }
}

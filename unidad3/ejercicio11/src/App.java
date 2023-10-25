import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner s = new Scanner(System.in);
        System.out.println("Introduzca cuantos kilobytes quiere pasar a megas");
        
        float kb= s.nextFloat();
        float megas = kb / 1000;
        
        System.out.println("El resultado son " + megas + "megas");
    s.close();
    
    }
}

import java.util.Scanner;
    
public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    
            System.out.println("Introduzca el radio y la altura con un espacio entre ambas para hallar el volumen de un cono:");

            double rad = s.nextDouble();
            double alt = s.nextDouble();

            double vol = (Math.PI * (rad*rad) * alt)/3;
            System.out.println("El volumen del cono es " + vol);
            s.close();
    }
}

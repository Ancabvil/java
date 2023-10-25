import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("Vamos a calcular el área de un rectángulo.");
        System.out.print("Introduzca el altura y la base separadas por un espacio \s:");

        int alt=s.nextInt();
        int base=s.nextInt();

        int tri= base * alt;

        System.out.println("El área del rectángulo es: " + tri);
        s.close();
    }
}

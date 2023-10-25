import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) throws Exception {
Scanner s = new Scanner(System.in);
    System.out.println("Vamos a calcular el área de un triángulo.");
    System.out.println( "Introduzca el altura y la base separadas por un espacio:");

    int alt = s.nextInt();
    int base = s.nextInt();

    int tri = (base * alt) / 2;

    System.out.println("El área del triángulo es: " + tri);
    s.close();
}
}

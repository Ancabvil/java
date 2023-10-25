import java.util.Scanner;

public class Ejercicio4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número:");
    int num1 = s.nextInt();
    System.out.print("Introduce otro número: ");
    int num2 = s.nextInt();
    int suma = num1 + num2;
    int resta = num1 - num2;
    int multi = num1 * num2;
    int div = num1 / num2;
    System.out.println("La suma es " + suma);
    System.out.println("La resta es " + resta);
    System.out.println("La multiplicación es " + multi);
    System.out.println("la división es " + div);
  }
}

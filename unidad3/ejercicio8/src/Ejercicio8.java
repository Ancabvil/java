import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas \s:");
        int horas=s.nextInt();

        int total = horas * 12;
        System.out.println("El sueldo semanal según las horas son " + total + " euros.");
        s.close();
    }
}

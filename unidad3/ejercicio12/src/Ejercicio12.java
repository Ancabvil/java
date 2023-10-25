import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    
        System.out.println("Introduce la nota del primer examen: ");
        double nota1 = s.nextDouble();
        System.out.println("¿Que nota quieres sacar en el segundo trimestre?");
        double nota2 = s.nextDouble();
        double notafin = (nota2 - 0.4 *nota1)/0.6; 

        System.out.println("La nota que necesitas es " + notafin);
        s.close();

    }
}

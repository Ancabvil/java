public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Calcular la media de un grupo de números introducidos hasta negativo.");
        double i = 0;
        double suma = 0;
        double num = 0;
        while (suma >= 0){
        System.out.print("Introduzca un número:");
        suma = Double.parseDouble(System.console().readLine());
        i++;
        num +=suma;
        }
        System.out.println("Has introducido " + (i -1) + " números positivos.");
        System.out.println("La media es " + (num - suma)/(i -1));
    }
}

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Calcular la media de un grupo de números introducidos hasta negativo.");
        double i = 0;
        double suma = 0;
        double num = 0;
        while (num >= 0){
        System.out.print("Introduzca un número:");
        num = Double.parseDouble(System.console().readLine());
        i++;
        suma +=num;
        }
        System.out.println("Has introducido " + (num -i) + " números positivos.");
        System.out.println("La media es " + (suma - i)/(num -1));
    }
}

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        String linea;
        System.out.println("Introduzca la cantidad para convertir a pesetas.");
        linea = System.console().readLine();
        double num;
        num = Double.parseDouble( linea );
        double total= num * 166.38;
        System.out.println("La cantidad en pesetas es " + total);
        

    }
}

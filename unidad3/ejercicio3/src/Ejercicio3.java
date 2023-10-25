public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        String linea;
        System.out.println("Introduzca la cantidad para convertir a euros.");
        linea = System.console().readLine();
        double num;
        num = Double.parseDouble( linea );
        double total= num * 0.00601012;
        System.out.println("La cantidad en euros es " + total);
    }
}

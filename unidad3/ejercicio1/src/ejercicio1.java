public class ejercicio1 {

  public static void main(String[] args) throws Exception {
    String linea;
    System.out.println("Introduzca un número");
    linea = System.console().readLine();
    int num1;
    num1 = Integer.parseInt(linea);

    System.out.println("Introduzca otro número");
    linea = System.console().readLine();
    int num2;
    num2 = Integer.parseInt(linea);

    int total = num1 * num2;
    System.out.println("El resultado de la multiplicación es " + total);
  }
}

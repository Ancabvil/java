public class Ejercicio23 {

  public static void main(String[] args) throws Exception {
    System.out.println("Introduzca números hasta 10000.");
    System.out.println(
      "Luego muestra total, cuenta de números y hace la media."
    );
    int numTotal = 0;
    int numeros = 0;
    do {
      int numIntro = Integer.parseInt(System.console().readLine());
      numTotal += numIntro;
      numeros++;
    } while (numTotal <= 10000);
    System.out.println("Ha introducido " + numTotal);
    System.out.println("Ha introducido " + numeros + " números.");
    System.out.println("La media es " + numTotal / numeros);
  }
}

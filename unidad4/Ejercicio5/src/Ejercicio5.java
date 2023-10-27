public class Ejercicio5 {

  public static void main(String[] args) throws Exception {
    System.out.println("Este programa resuelve ecuaciones de primer grado");
    System.out.println("Introduzca el primer valor:");
    String lin1 = System.console().readLine();
    double var1 = Double.parseDouble(lin1);
    System.out.println("Introduce el segundo valor:");
    String lin2 = System.console().readLine();
    double var2 = Double.parseDouble(lin2);
    double resul;
    if (var1 != 0) {
      resul = (-var2) / var1;
      System.out.println("El resultado es " + resul);
    } else {
      System.out.println("El resultado no es un número real.");
    }
  }
}

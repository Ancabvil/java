public class Ejercicio33 {

  public static void main(String[] args) throws Exception {
    System.out.println("Le pinto una U con asteriscos.");
    System.out.print("Introduzca la altura: ");
    int altura = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < altura; i++) {
      System.out.print("* ");
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }
    System.out.print("  ");
    for (int i = 1; i <= altura; i++) {
      System.out.print("*");
    }
  }
}

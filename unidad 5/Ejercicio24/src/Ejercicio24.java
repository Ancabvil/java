public class Ejercicio24 {

  public static void main(String[] args) throws Exception {
    System.out.println("Hace una pirámide con altura N formada por números.");
    System.out.print("Introduzca la altura:");
    int alturaIntro = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int i = 0;
    int espacios = alturaIntro - 1;

    while (altura <= alturaIntro) {
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }

      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      System.out.println("");
      altura++;
      espacios--;
    }
  }
}

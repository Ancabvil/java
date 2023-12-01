public class Ejercicio38 {

  public static void main(String[] args) throws Exception {
    System.out.println("Reloj de arena hueco");
    System.out.print("Introduce la altura: ");
    int alturaIntro = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int asteriscos = alturaIntro;
    int espaciosDelante = 0;
    if (alturaIntro < 3 || altura % 2 == 0) {
      System.out.println(
        "La altura no es valida, debe ser igual o superior a 3 y prima."
      );
    } else {
      while (altura < alturaIntro / 2 + 1) {
        for (int i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }
        for (int i = 0; i < asteriscos; i++) {
          System.out.print("*");
        }
        System.out.println();
        altura++;
        espaciosDelante++;
        asteriscos -= 2;
      }
      espaciosDelante = alturaIntro / 2;
      altura = 1;
      while (altura <= alturaIntro / 2 + 1) {
        for (int i = 1; i <= espaciosDelante; i++) {
          System.out.print(" ");
        }
        for (int i = 0; i < asteriscos; i++) {
          System.out.print("*");
        }
        System.out.println();
        altura++;
        espaciosDelante--;
        asteriscos += 2;
      }
    }
  }
}

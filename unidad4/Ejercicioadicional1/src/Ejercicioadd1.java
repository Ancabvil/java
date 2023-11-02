public class Ejercicioadd1 {

  public static void main(String[] args) throws Exception {
    System.out.println("Le saludo según la hora que sea.");
    System.out.println("Introduzca que hora es en formato de 0 a 23");
    String a = System.console().readLine();
    int hora = Integer.parseInt(a);

    if (hora < 0 || hora > 23) {
      System.out.println("Esa hora no es válida");
    } else if (hora >= 9 && hora <= 12) {
      System.out.println("Buenos dias");
    } else if (hora >= 13 && hora <= 21) {
      System.out.println("Buenas tardes");
    } else if (hora >= 22 || hora <= 8 || hora == 0) {
      System.out.println("Buenas noches");
    }
  }
}

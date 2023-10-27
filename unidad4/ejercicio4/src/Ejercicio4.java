public class Ejercicio4 {

  public static void main(String[] args) throws Exception {
    System.out.println(
      "Por favor, introduce el número de horas trabajadas esta semana:"
    );
    int horas = Integer.parseInt(System.console().readLine());
    int sueldo;
    if (horas > 40) {
      sueldo = horas * 16;
      System.out.println("Tu sueldo es " + sueldo);
    } else {
      sueldo = horas * 12;
      System.out.println("Tu sueldo es " + sueldo);
    }
  }
}

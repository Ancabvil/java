public class Ejercicio10 {

  public static void main(String[] args) throws Exception {
    System.out.println("Introduce primero el día de nacimiento");
    String a = System.console().readLine();
    int dia = Integer.parseInt(a);
    System.out.println("Ahora introduzca el número de su mes de nacimiento");
    String b = System.console().readLine();
    int mes = Integer.parseInt(b);

    int total = ((mes * 30) - dia) + 5;

    if (total <= 29) {
      System.out.println("Su horoscopo es Acuario");
    }
    if (total >= 30 && total <= 60) {
      System.out.println("Su Horoscopo es Piscis");
    }
    if (total >= 61 && total <= 90) {
      System.out.println("Su horoscopo es Aries");
    }
    if (total >= 91 && total <= 120) {
      System.out.println("Su horoscopo es Tauro");
    }
    if (total >= 121 && total <= 150) {
      System.out.println("Su horoscopo es Géminis");
    }
    if (total >= 151 && total <= 180) {
      System.out.println("Su horoscopo es Cáncer");
    }
    if (total >= 181 && total <= 210) {
      System.out.println("Su horoscopo es Leo");
    }
    if (total >= 211 && total <= 240) {
      System.out.println("Su horoscopo es Virgo");
    }
    if (total >= 241 && total <= 270) {
      System.out.println("Su horoscopo es Libra");
    }
    if (total >= 271 && total <= 300) {
      System.out.println("Su horoscopo es Escorpio");
    }
    if (total >= 301 && total <= 330) {
      System.out.println("Su horoscopo es Sagitario");
    }
    if (total >= 331 && total <= 360) {
      System.out.println("Su horoscopo es Capricornio");
    }
  }
}

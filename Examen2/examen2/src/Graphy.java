public class Graphy {

  public static void main(String[] args) throws Exception {
    System.out.print("Introduzca un número: ");
    long numIntro = Long.parseLong(System.console().readLine());
    System.out.print("Simple o en Color (escriba S o C): ");
    String formato = (System.console().readLine());
    boolean formatoIntro = false;
    long num = numIntro;
    int numDigitos = 0;
    long voltea = 0;

    switch (formato) {
      case "s":
        formatoIntro = true;
        break;
      case "S":
        formatoIntro = true;
        break;
      case "c":
        formatoIntro = true;
        break;
      case "C":
        formatoIntro = true;
      default:
        formatoIntro = false;
        break;
    }
    if (formatoIntro = true) {
      //Voltea el número y luego lo vuelve a poner en orden.
      while (num > 0) {
        voltea = ((voltea * 10) + (num % 10));
        num /= 10;
        numDigitos++;
      }
      long cifra = 0;
      for (int i = 0; i <= voltea; i++) {
        cifra = voltea % 10;
        voltea /= 10;
        System.out.println(cifra);
      }
      //Busco cual es el valor más alto.
      long numMax = 0;
      while (cifra < numDigitos) {
        for (int i = 1; i > numMax; i++) {
          numMax +=1;
        }
        //Con estos dos bucles pinto las celdas de la tabla.
        for (int i = 0; i <= numMax + 1; i++) {
          System.out.print("---");
          for (i = 0; i < numMax + 1; i++) {
            System.out.println("|  ");
            numMax--;
          }
        }
      }
    } else {
      System.out.println("Esa opción no está contemplada.");
    }
  }
}

public class Ejercicio30 {

  public static void main(String[] args) throws Exception {
    System.out.print("Introduzca el primer día: ");
    String diaPrimero = (System.console().readLine());
    System.out.print("Introduzca la primera hora: ");
    int horaPrimera = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo día: ");
    String diaSegundo = (System.console().readLine());
    System.out.print("Introduzca la segunda hora: ");
    int horaSegunda = Integer.parseInt(System.console().readLine());

    int diaContador1 = 0;
    int diaContador2 = 0;
    String nombrePrimer ="";
    String nombreSegundo ="";
    do {
      switch (diaPrimero) {
        case "Lunes":
        case "1":
          diaContador1 = 1;
        nombrePrimer = "Lunes";
          break;
        case "Martes":
        case "2":
          diaContador1 = 2;
          nombrePrimer = "Martes";
          break;
        case "Miercoles":
        case "3":
          diaContador1 = 3;
          nombrePrimer = "Miercoles";
          break;
        case "Jueves":
        case "4":
          diaContador1 = 4;
          nombrePrimer = "Jueves";
          break;
        case "Viernes":
        case "5":
          diaContador1 = 5;
          nombrePrimer = "Viernes";
          break;
        case "Sábado":
        case "6":
          diaContador1 = 6;
          nombrePrimer = "Sábado";
          break;
        case "Domingo":
        case "7":
          diaContador1 = 7;
          nombrePrimer = "Domingo";
          break;
        default:
          break;
      }

      switch (diaSegundo) {
        case "Lunes":
        case "1":
          diaContador2 = 1;
          nombreSegundo = "Lunes";
          break;
        case "Martes":
        case "2":
          diaContador2 = 2;
          nombreSegundo = "Martes";
          break;
        case "Miercoles":
        case "3":
          diaContador2 = 3;
          nombreSegundo = "Miercoles";
          break;
        case "Jueves":
        case "4":
          diaContador2 = 4;
          nombreSegundo = "Jueves";
          break;
        case "Viernes":
        case "5":
          diaContador2 = 5;
          nombreSegundo = "Viernes";
          break;
        case "Sábado":
        case "6":
          diaContador2 = 6;
          nombreSegundo = "Sábado";
          break;
        case "Domingo":
        case "7":
          diaContador2 = 7;
          nombreSegundo = "Domingo";
          break;
        default:
          break;
      }
      if (diaContador1 > diaContador2) {
        System.out.println("No se puede volver atrás en el tiempo.");
      }
      if (diaContador1 == 0 || diaContador2 == 0) {
        System.out.println("0 no es un valor válido para día de la semana.");
      }
      if (
        horaPrimera < 0 ||
        horaPrimera > 23 ||
        horaSegunda < 0 ||
        horaSegunda > 23
      ) {
        System.out.println(
          "La hora está mal introducida. Debe ser entre 0 y 23"
        );
      }
    } while (diaContador1 < diaContador2 && horaPrimera < horaSegunda);

    System.out.println("Entre las " + horaPrimera + ":00 del " + nombrePrimer);
    System.out.println("Y las " + horaSegunda + ":00 del " + nombreSegundo);
    System.out.println(
      "Hay " +
      (
        ((diaContador2 * 24) + horaSegunda) -
        ((diaContador1 * 24) + horaPrimera)
      ) +
      " horas."
    );
  }
}

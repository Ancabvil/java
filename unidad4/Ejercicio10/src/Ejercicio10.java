public class Ejercicio10 {

  public static void main(String[] args) throws Exception {
    String horoscopo = "";
    System.out.println("Introduce primero el día de nacimiento");
    String a = System.console().readLine();
    int dia = Integer.parseInt(a);
    System.out.println("Ahora introduzca el número de su mes de nacimiento");
    String b = System.console().readLine();
    int mes = Integer.parseInt(b);

    switch (mes) {
      case 1:
        if (dia <= 21) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        }

        break;
      case 2:
        if (dia < 18) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        }
        break;
      case 3:
        if (dia <= 20) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        }
        break;
      case 4:
        if (dia <= 19) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        }
        break;
      case 5:
        if (dia <= 20) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Géminis";
        }
        break;
      case 6:
        if (dia <= 21) {
          horoscopo = "Géminis";
        } else {
          horoscopo = "Cáncer";
        }
        break;
      case 7:
        if (dia <= 21) {
          horoscopo = "Cáncer";
        } else {
          horoscopo = "Leo";
        }
        break;
      case 8:
        if (dia <= 22) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        }
        break;
      case 9:
        if (dia <= 22) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        }
        break;
      case 10:
        if (dia <= 22) {
          horoscopo = "Libra";
        } else {
          horoscopo = "Escorpio";
        }
        break;
      case 11:
        if (dia <= 21) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        }
        break;
      case 12:
        if (dia <= 21) {
          horoscopo = "Sagitario";
        } else {
          horoscopo = "Capricornio";
        }
        break;
      default:
    }
    System.out.println("Su horoscopo es " + horoscopo);
  }
}

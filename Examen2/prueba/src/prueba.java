public class prueba {

  public static void main(String[] args) throws Exception {
    System.out.println("Adivina intervalo.");

    int numeroPrograma = 0;
    int numeroUsuario = 0;

    int intervaloA = 0;
    int intervaloB = 0;

    int intervaloMaximo;
    int intervaloMinimo;

    boolean salir = false;
    boolean fin = false;
    System.out.println(
        "Aleatorium pensará un número entre los valores que tu decidas");
    System.out.print("Introduce el valor mínimo del intervalo: ");
    intervaloA = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor máximo del intervalo: ");
    intervaloB = Integer.parseInt(System.console().readLine());

    
      do {
        intervaloMinimo = (int) ((Math.random() * intervaloB - intervaloA +1) + intervaloA);
      } while (intervaloMinimo < intervaloA);
      do {
        intervaloMaximo = (int) ((Math.random() * intervaloB - intervaloA +1) + intervaloA);
      } while (intervaloMaximo > intervaloB || intervaloMaximo == intervaloMinimo);

      if (intervaloMinimo > intervaloMaximo) {
        int aux = 0;
        aux = intervaloMaximo;
        intervaloMaximo = intervaloMinimo;
        intervaloMinimo = aux;
      }
      int intentos = (int) (Math.log(intervaloMaximo - intervaloMinimo + 1) / Math.log(2));


      numeroPrograma = (int) ((Math.random() * intervaloMaximo - intervaloMinimo + 1) +
          intervaloMinimo);

      do {
        System.out.println(
            "Estoy pensando un número entre " +
                intervaloMinimo +
                " y " +
                intervaloMaximo);
        System.out.println("Tienes " + intentos + " intentos.");
        System.out.print("Escribe el número: ");
        numeroUsuario = Integer.parseInt(System.console().readLine());

        if (numeroPrograma > numeroUsuario) {
          System.out.println("Te has quedado corto.");
        }
        if (numeroPrograma < numeroUsuario) {
          System.out.println("Te has pasado.");
        }
        if (numeroPrograma == numeroUsuario) {
          System.out.println("Enhorabuena!!! has acertado");
          System.out.println("Efectivamente, el número era " + numeroPrograma);
          salir = true;
        }
        
        intentos--;
        
      } while (intentos > 0 && salir == false);

      if (intentos == 0 && salir == true) {
        System.out.println("Has superado el número de intentos.");
        System.out.println(
            "El número que habia pensado era: " + numeroPrograma);
      }
      if (salir == true) {
        fin = false;
        while (fin)
          ;

        System.out.println("Elige una opción");
        System.out.println("1. Volver a jugar.");
        System.out.println("2. Salir del juego.");

        System.out.print("Opción: ");
        int opción = Integer.parseInt(System.console().readLine());
        switch (opción) {
          case 1:
            salir = false;
            break;
          case 2:
            fin = true;
            System.out.println("Gracias por jugar a ALEATORIUM");
            break;
          default:
            System.out.println("Esa opción no está contemplada.");
            break;
        }
      }
    }
  }


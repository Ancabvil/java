public class TokiPakala {

  public static void main(String[] args) throws Exception {
    System.out.println("Generador de Toki Pakala");

    String vocal = "";
    String consonante = "";

    int parteA;
    int parteB;

    int silaba;

    int palabra = 0;
    int cuentaPalabras;

    int frase;
    int cuentaFrases;

    int parrafo;
    int cuentaParrafo;

    int texto;
    int cuentaTexto;

    texto = (int) (Math.random() * 21 + 1);
    cuentaTexto = texto;

    //Este while se encarga de imprimir el texto completo.
    while (cuentaTexto > 0) {
      cuentaTexto--;
      parrafo = (int) (Math.random() * 12 + 1);
      cuentaParrafo = parrafo;

      //Este de cada parrafo.
      while (cuentaParrafo > 0) {
        cuentaParrafo--;
        frase = (int) (Math.random() * 53 + 1);
        cuentaFrases = frase;

        // Este de las frases
        while (cuentaFrases > 0) {
          palabra = (int) (Math.random() * 5 + 1);
          cuentaFrases--;
          cuentaPalabras = palabra;
          //Este forma las palabras usando las variables parteA y parteB dependiendo si tiene una o dos sílabas
          while (cuentaPalabras > 0) {
            cuentaPalabras--;

            silaba = (int) ((Math.random() * 2) + 1);
            parteA = (int) (Math.random() * 5 + 1);

            //He dividido los switch en dos, este se ocupa de las vocales
            switch (parteA) {
              case 1:
                vocal = "a";
                break;
              case 2:
                vocal = "e";
                break;
              case 3:
                vocal = "i";
                break;
              case 4:
                vocal = "o";
                break;
              case 5:
                vocal = "u";
                break;
              default:
                break;
            }
            parteB = (int) (Math.random() * 9 + 1);

            //Este se ocupa de las consonantes
            switch (parteB) {
              case 1:
                consonante = "p";
                break;
              case 2:
                consonante = "t";
                break;
              case 3:
                consonante = "k";
                break;
              case 4:
                consonante = "s";
                break;
              case 5:
                consonante = "m";
                break;
              case 6:
                consonante = "n";
                break;
              case 7:
                consonante = "l";
                break;
              case 8:
                consonante = "j";
                break;
              case 9:
                consonante = "w";
                break;
              default:
                break;
            }

            //Con esto controlo que las silabas tengan una o dos letras
            if (silaba == 1) {
              System.out.print(vocal);
            }
            if (silaba > 1) {
              System.out.print(consonante + vocal);
            }
          }
          System.out.print(" ");
        }
        System.out.print(".");
      }
      //Aquí añado dos retornos de carro para que se puedan apreciar los parrafos.
      System.out.println();
      System.out.println();
    }
    System.out.println();
    System.out.println();
  }
}

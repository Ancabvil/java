public class Ejercicio37 {

  public static void main(String[] args) throws Exception {
    System.out.println("Conversor de decimal a palotes.");
    int numeroIntro;
    do {
      System.out.print("Introduzca un número decimal positivo: ");
      numeroIntro = Integer.parseInt(System.console().readLine());
    } while (numeroIntro < 1);
    System.out.print(numeroIntro + " = ");

    int numero = numeroIntro;
    int numDig = 0;
    int numReves = 0;

    while (numero > 0) {
      numReves = ((numReves * 10) + (numero % 10));
      numero /= 10;
      numDig++;
    }
    int cifra = 0;
    for (int i = 0; i < numDig; i++) {
      cifra = numReves % 10;
      numReves /= 10;
      for (int j = 0; j < cifra; j++) {
        System.out.print("|");
      }
      if (i < numDig - 1) {
        System.out.print("-");
      }
    }
  }
}

public class Ejercicio5 {

  public static void main(String[] args) throws Exception {
    System.out.println(
      "Imprime 50 números aleatorios entre 100 y 199 incluidos."
    );
    int suma = 0;
    int minimo = 100;
    int maximo = 199;
    int num = 0;
    for (int i = 0; i < 50; i++) {
      num = (int) (Math.random() * 100) + 100;
      System.out.print(num + " ");
      suma += num;
    }

    if (num < minimo) {
      minimo = num;
    }
    if (num > maximo) {
      maximo = num;
    }
    System.out.println(
      "\n Mínimo " + minimo + " \n Máximo " + maximo + " \n Media: " + suma / 50
    );
  }
}

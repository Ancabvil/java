public class Ejercicio12 {

  public static void main(String[] args) throws Exception {
    System.out.println("Muestro n números de la secuencia de Fibonacci");
    int num1 = 0;
    int num2 = 1;
    int temp = 1;
    System.out.print("Introduzca un número:");
    int numIntro = Integer.parseInt(System.console().readLine());
    if (numIntro == 1) {
    System.out.println("1");
    } else {
        while (numIntro >= 1){
            temp = num1;
            num1 = num2;
            num2 = temp + num2;
        System.out.print(num2);
        numIntro--;
        }
      }
    }
  }


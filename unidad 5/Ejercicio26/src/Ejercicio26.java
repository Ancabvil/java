public class Ejercicio26 {
  public static void main(String[] args) throws Exception {
    System.out.println("Introduce un número y luego un dígito, luego te digo donde se encuentra este último.");
    System.out.print("Introduce un número:");
    int numeroGeneral = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el dígito:");
    int digito = Integer.parseInt(System.console().readLine());
    System.out.println("Empezando por la izquierda, el " + digito + " aparece dentro de " + numeroGeneral + " en las siguientes posiciones: ");

    int numero = numeroGeneral;
    int volteado = 0;
    int longitud = 0;
    int posicion = 0;

    if (numero==0){
        longitud ++;
    }

    while(numero> 0) {
        volteado = (volteado * 10) + (numero%10);
        numero/=10;
        longitud ++;
    }

    while (volteado > 10){
        if ((volteado %10) == digito){
            System.out.print(posicion + " ");
        }
        volteado /=10;
        posicion++;
    }
    System.out.println();
    }

  }


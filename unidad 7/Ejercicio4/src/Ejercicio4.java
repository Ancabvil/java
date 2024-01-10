public class Ejercicio4 {

  public static void main(String[] args) throws Exception {
    System.out.println("Array en columnas.");

    int numero[] = new int[20];
    int cuadrado[] = new int[20];
    int cubo[] = new int[20];

    for (int n : numero) {
      int num = (int) (Math.random() * (100 + 1));
      numero[n]=num;
      int cuad = num * num;
      cuadrado[n]=cuad;
      int cub = num * num * num;
      cubo[n] = cub;
      System.out.println(num + " " + cuad + " " + cub);
    
    }
  }
}

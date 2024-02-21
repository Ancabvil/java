import java.util.ArrayList;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        System.out.println("ArrayList de numeros aleatorios");
        ArrayList<Integer> numero = new ArrayList<>();
        int aleatoriosPos = (int)(Math.random()*(20-10)+10);

        for ( int i = 0; i < aleatoriosPos; i++  ) {
            int aleatoriosNum = (int)(Math.random()*100+1);
            numero.add(aleatoriosNum);
            System.out.println(numero.toString());
        }

    }
}

import java.util.ArrayList;
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Arraylist 1");

        ArrayList <String> compis = new ArrayList<>();

        compis.add("Jorge");
        compis.add("Paco");
        compis.add("Pepe");
        compis.add("Ezekiel");
        compis.add("Juana");
        compis.add("Ana");
for (String string : compis) {
    System.out.print(string.toString()+" ");
}
    }
}

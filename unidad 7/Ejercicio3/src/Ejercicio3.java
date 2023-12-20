public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce 10 números y te los voltea.");
    
    int num[]= new int[10];
    for(int i = 0; i < 10; i++){
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    num[i] = numero;
}
    for (int i = 9; i >= 0; i--) {
    System.out.println(num[i]);    
    }
    }
}
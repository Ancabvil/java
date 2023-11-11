public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        System.out.println("Le calculo cuadrado y el cubo de 5 números a partir del que introduzca");
        System.out.print("Introduzca un número:");
        int numero = Integer.parseInt(System.console().readLine());
        for (int i = numero; i < (numero+5) ; i++ ){
        System.out.printf("%4d %6d %8d\n", i , i * i, i * i * i);
        }
    }
}

public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca un número por teclado para saber si es par o divisible entre 5:");
        String number = System.console().readLine();
        int numero = Integer.parseInt(number);
        if (numero % 2 == 0) {
            System.out.println("El número introducido es par.");
            } else if (numero % 5 == 0){
            System.out.println("El número es divisible por 5");
            } else {
            System.out.println("El número no es par ni divisible por 5");
            }
    }
}

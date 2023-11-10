public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Calcula el número de números introducido.");
        System.out.print("Introduce un número:");
        int num = Integer.parseInt(System.console().readLine());
        int numerointro = num;
        int numeroDeDigitos = 1 ;
                while (num > 10){
                    num /=10;
                    numeroDeDigitos++;
                }
                System.out.println(numerointro +" tiene " + numeroDeDigitos + " digitos.");
            }
}


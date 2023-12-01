public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Adivina el número al azar entre 0 y 100. Tienes 5 intentos.");
        for (int i = 1; i < 5; i++){
        int numero = (int)(Math.random()*99+1);
            System.out.print("Introduce un número: ");
            int prueba = Integer.parseInt(System.console().readLine());
        
            int intentos = 5;
            if(prueba == numero){
                System.out.println("¡Has acertado!");
            }else if(numero < prueba){
                intentos--;
                System.out.println("Ha fallado, le quedan " + intentos + " y el número es menor.");
            }else if(numero > prueba){
                intentos--;
                System.out.println("Ha fallado, le quedan " + intentos + " y el número es mayor.");
            }
        }
    }
}

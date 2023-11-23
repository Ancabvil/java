public class Ejercicio29 {
    public static void main(String[] args) throws Exception {
        System.out.println("Muestra por pantalla los números positivos menores positivos.");
        System.out.println("Y además sean divisibles por otro número introducido.");
        System.out.print("Introduzca el número del que parte: ");
        int numPartida = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el divisor: ");
        int divisor = Integer.parseInt(System.console().readLine());

        if (numPartida == 0 ){
            System.out.println("No hay números para mostrar.");
        }

        System.out.println("Los números menores de " + numPartida);
        System.out.println("que no son divisibles entre " + divisor + " son :");
        for(int i = 1; i < numPartida ; i++ ){
               if((i % divisor != 0)){
                 System.out.println(i + " ");
               }
            }
    }
}

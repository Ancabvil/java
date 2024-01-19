public class Ejercicio11b {
    public static void main(String[] args) throws Exception {
        System.out.println("De 200 a 300 con diagonales.");

        int tablero[][] = new int[9][9];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]= (int)((Math.random()*100)+200);
                System.out.print(" " + tablero[i][j] + " ");
            }System.out.println();
        }System.out.println();
        int max = 200;
        int min = 300;
        int sum = 0;

        for (int i = 0; i < tablero.length; i++) {
            int numero = tablero[i][i];
                System.out.print(" " + numero + " ");
                if (numero < max) {
                    max = numero;
                }
                if (numero > min) {
                    min = numero;
                }
                sum += numero;
            
            
            System.out.print("");

        }
        System.out.println("\nMáximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + ((double)sum / 10));

    }
}

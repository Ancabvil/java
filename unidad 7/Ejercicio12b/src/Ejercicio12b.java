public class Ejercicio12b {
    public static void main(String[] args) throws Exception {
        System.out.println("De 500 a 900 con diagonales");

        int muestra[][] = new int[9][9];

        for (int i = 0; i < muestra.length; i++) {
            for (int j = 0; j < muestra.length; j++) {
                
                muestra[i][j] = (int)((Math.random()*400)+500);
                System.out.print(" " +muestra[i][j]+ " ");
            }System.out.println();
        }
int minimo = 900;
int maximo = 500;
int suma = 0;
System.out.println(" ------------------------------------------- ");
for (int i = 0; i < muestra.length; i++) {
 int numero = muestra[8 - i][i];
 System.out.print(" "+ numero + " ");
 if (numero > maximo) {
    numero = maximo;
    }
if (numero < minimo) {
    numero = minimo;
}
    suma += numero;
}
System.out.println("\n Máximo: " + maximo);
System.out.println(" Mínimo: " + minimo);
System.out.println(" Media: " + ((double) suma / 10));
    }
}

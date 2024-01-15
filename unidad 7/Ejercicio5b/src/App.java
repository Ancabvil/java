public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Array 6x10 de enteros entre 0 y 1000 con máximo y mínimo.");

        int filas;
        int columnas;
        int num[][] = new int[7][11];
        int numero;

        int minimo = Integer.MAX_VALUE;
        int filaMinimo = 0;
        int columnasMinimo = 0;

        int maximo = Integer.MIN_VALUE;
        int filaMaximo = 0;
        int columnasMaximo = 0;

        for(filas = 0; filas < 7 ; filas++){

            for(columnas = 0; columnas < 11; columnas++){
                numero=(int)(Math.random()*1001);
                num[filas][columnas]=numero;
                System.out.print(num[filas][columnas]);
                System.out.println();
            }
            
        }

        for(filas = 0; filas < 6; filas++) {
            System.out.print(" " + filas + " │");
            for(columnas = 0; columnas < 10; columnas++) {
            num[filas][columnas] = (int)(Math.random() * 1001);
            System.out.print(num[filas][columnas] + " ");
            Thread.sleep(100);
            // Calcula el mínimo y guarda sus coordenadas
            if (num[filas][columnas] < minimo) {
            minimo = num[filas][columnas];
            filaMinimo = filas;
            columnasMinimo = columnas;
            }
            // Calcula el máximo y guarda sus coordenadas
            if (num[filas][columnas] > maximo) {
            maximo = num[filas][columnas];
            filaMaximo = filas;
            columnasMaximo = columnas;
            }
            }
            System.out.println("El máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnasMaximo);
            System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnasMinimo);




    }
}
}
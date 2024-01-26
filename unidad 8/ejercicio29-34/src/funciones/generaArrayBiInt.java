package funciones;

public class generaArrayBiInt {
    public static int[][]ArrayBiInt(int filas, int columnas, int minimo, int maximo){
        int[][]x = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                x[i][j] = (int)(Math.random()*(maximo-minimo)+minimo +1);
            }
            
        }return x;
    }
    
}

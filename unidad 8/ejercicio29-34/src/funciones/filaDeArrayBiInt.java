package funciones;

public class filaDeArrayBiInt {
    public static int[] FilaArrayBiInt(int x[][], int fila){
        int[] f = new int[x[0].length];

        for (int i = 0; i < x[0].length; i++) {
            f[i] = x[fila][i];
        }

        return f;
    }
}

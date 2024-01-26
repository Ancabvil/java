package funciones;

public class columnaArrayBiInt {
    public static int[] ColumnaDeArrayBiInt(int x[][], int columna){
        int[] c = new int[x.length];

        for (int i = 0; i < x.length; i++) {
            c[i] = x[i][columna];
        }
        return c;


    }
}

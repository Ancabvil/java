package funciones.bidimensional;

public class minimoArrayInt {
    public static int MinimoArrayInt(int[] x) {
        int minimo = Integer.MAX_VALUE;
        for (int n : x) {
        if (n < minimo) {
        minimo = n;
        }
        }
        return minimo;
        }
        
    }
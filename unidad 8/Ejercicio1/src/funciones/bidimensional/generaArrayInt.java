package funciones.bidimensional;

public class generaArrayInt {
    public static int[] generaArrayInt(int n, int minimo, int maximo){

        int[]x = new int[n];
    
        for (int i = 0; i < n; i++){
            x[i] = (int)((Math.random()*maximo - minimo +1)+minimo);
        }
        return x;
    }    
}
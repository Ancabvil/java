package funciones.bidimensional;

public class mediaArrayInt {
    public static double mediaArrayInt(int[] x) {
        int suma = 0;
        for (int n : x) {
        suma += n;
        }
        return (double)suma / x.length;
        }
    
    
}
    
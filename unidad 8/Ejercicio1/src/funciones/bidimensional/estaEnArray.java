package funciones.bidimensional;

public class estaEnArray {
    public static boolean estaEnArray(int[]x, int n){
        for(int numero : x){
            if (numero == n){
                return true;
            }
        }
        return false;
    }
    
}

package funciones;

public class coordenadasEnArrayBiInt {
    public static int[] CoordenadasEnArrayBiInt(int x[][], int n){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                if (x[i][j]== n) {
                    int[] coordenadas = {i,j};
                    return coordenadas;
                }
            }
        }
        int[]coordenadas = {-1,-1};
        return coordenadas;
    }
    
}

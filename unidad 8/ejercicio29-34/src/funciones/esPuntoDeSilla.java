package funciones;
public class esPuntoDeSilla {
    public static boolean EspuntoDeSilla(int x[][], int i, int j){
        int[]fila = filaDeArrayBiInt.FilaArrayBiInt(x, i);
        int[]columna = columnaArrayBiInt.ColumnaDeArrayBiInt(x,j);

        return ((minimoArrayInt.MinimoArrayInt(fila)==x[i][j] &&
        (maximoArrayInt.MaximoArrayInt(columna)== x[i][j])));
    }}
    


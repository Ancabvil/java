package funciones;

public class diagonal {
    public static int[] Diagonal(int x[][], int fila, int columna, String direccion){
        int elementos = 0, i, j;
        int[] diagonalAux = new int[1000];

        for ( i = 0; i < x.length; i++) {
            for ( j = 0; j < x[0].length; j++) {
             if((((columna -j)== (fila-i))&& (direccion.equals("nose"))
             || (((columna -j)==(i - fila))&&  (direccion.equals("neso"))))){
                diagonalAux[elementos++]=x[i][j];
             }   
            }
            
        }
        int[] diagonal = new int[elementos];
        for ( j = 0; j < elementos; j++) {
            diagonal[j] = diagonalAux[j];
            
        }return diagonal;
    }
}

package funciones;

public class muestraArrayBiInt {
    static public void MuestraArrayBiInt(int a[][], int fila, int columna){
        
        for (int i = 0; i < fila ; i++) {
            System.out.print("Fila " +i+" ");
            for (int j = 0; j < columna; j++) {
            System.out.print(" [" + a[i][j] + "]");
            }System.out.println();
        }
        


    }
}

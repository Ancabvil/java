public class Ejercicio1b {
    public static void main(String[] args) throws Exception {
        System.out.println("Muestra array bidimensional 3x6");

        int fila;
        int columna;
        int num[][] = new int[3][6];

        num[0][0]=0;
        num[0][1]=30;
        num[0][2]=2;
        num[0][5]=5;
        num[1][0]=75;
        num[1][4]=0;
        num[2][2]=-2;
        num[2][3]=9;
        num[2][5]=11;
        
        System.out.println("Array num  |  Columna0  |  Columna1  |  Columna2  |  Columna3  |  Columna4  |  Columna5  |");
        System.out.println("------------------------------------------------------------------------------------------");
        for(fila =0; fila < 3; fila++){
            System.out.print("Fila    " + fila);
            for(columna=0; columna < 6; columna++){
                System.out.print("  |     " + num[fila][columna] + "    |   ");
            }
            System.out.println();
        }       
        System.out.println("------------------------------------------------------------------------------------------");

    }
}

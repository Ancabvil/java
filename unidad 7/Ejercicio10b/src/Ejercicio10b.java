public class Ejercicio10b {
    public static void main(String[] args) throws Exception {
        System.out.print("Tres en raya.");

        int tablero[][] = new int[3][3];
        int filas;
        int columnas;
        char ocupado = 'X';
        char vacio = ' ';
        boolean conteo=false;

        for (filas=0; filas <3; filas++) {
            System.out.println();
            for(columnas = 0; columnas <3; columnas++){
                
                int marca = (int)(Math.random()*3);
                if (marca >0 && conteo == false ) {
                System.out.print("|"+ocupado+"|");
                conteo= true;
                }else{
                tablero[filas][columnas]=vacio;
                System.out.print("|"+ vacio + "|");
            }
            }
    }
    //System.out.print("\nInserta la fila (De 0 a 2): ");
    //int filaJugador = Integer.parseInt(System.console().readLine());
    //System.out.print("Inserta la columna (De 0 a 2): ");
    //int columnaJugador = Integer.parseInt(System.console().readLine());
    //tablero[filaJugador][columnaJugador]=ocupado;
    
    
    }
}

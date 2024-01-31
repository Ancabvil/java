package unidad8.arrays2d;
/**
 * @author Antonio Manuel Cabrera Villarejo
 * @param fila para las filas del array
 * @param columna para las columnas
 * @param max para el maximo de números aleatorios
 * @param min para el mínimo de números aleatorios
 * 
 */
public class elementos {
    static public int AleatorioDeArray2d(int fila, int columna, int max, int min){
        int resultado=0;

        //inicio el array bidimensional dandole al segundo array el método random del math
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                resultado = (int)((Math.random()*(max - min)+min +1));
            }
        }
//Devuelvo el resultado
return resultado;

    }
}
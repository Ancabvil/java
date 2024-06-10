package unidad8.arrays2d;

import java.util.Random;
/**
 * @author Antonio Manuel Cabrera Villarejo
 * @param fila para las filas del array
 * @param columna para las columnas
 * @param max para el maximo de números aleatorios
 * @param min para el mínimo de números aleatorios
 * 
 */
public class elementos {
    static public int aleatorioDeArray2d(int[][] array2D){
        Random random = new Random();
        int filas = array2D.length;
        int columnas = array2D[0].length;
        int filaAleatoria = random.nextInt(filas);
        int columnaAleatoria = random.nextInt(columnas);
//Devuelvo el resultado
return array2D[filaAleatoria][columnaAleatoria];

    }
}
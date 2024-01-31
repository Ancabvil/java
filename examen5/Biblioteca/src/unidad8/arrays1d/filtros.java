package unidad8.arrays1d;
/**
 * @author Antonio Manuel Cabrera Villarejo
 * @param numeroIntro es el número que le introducimos al la función para comprobar en los arrays
 */
public class filtros {
    static public int[] FiltraConCifra(int numeroIntro){
        
        //He creado dos arrays para compararlos entre sí.
        int arrayPrin[] = new int[numeroIntro];
        int arrayAux[] = new int[numeroIntro];
        //Además de dos variables para guardar resultados.
        int resultado=0;
        int resultadoAux=0;
        //recorro los arrays y guardo los resultados en cada variable
        for (int i = 0; i < arrayPrin.length; i++) {
           resultado= arrayPrin[i];
        }

        for (int i = 0; i < arrayAux.length; i++) {
            resultadoAux = arrayAux[i];
        }
        //comparo ambos resultados y los guardo en el array principal
        if(resultado == resultadoAux){
            for (int i = 0; i < arrayPrin.length; i++) {
                arrayPrin[i]=arrayAux[i];
                
            }
        }
        //devuelvo el array principal con los resultados
        return arrayAux;
    }
}
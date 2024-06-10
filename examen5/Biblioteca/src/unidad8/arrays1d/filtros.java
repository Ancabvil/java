package unidad8.arrays1d;

import unidad8.números.cifras;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Antonio Manuel Cabrera Villarejo
 * @param numeroIntro es el número que le introducimos al la función para comprobar en los arrays
 */
public class filtros {
    static public int[] FiltraConCifra(int[] array, int cifra){
        
       List<Integer> filtrados = new ArrayList<>();
       for(int num : array){
        if (cifras.ContieneCifra(num, cifra)){
            filtrados.add(num);
        }
       }
        return filtrados.stream().mapToInt(i -> i).toArray();
    }
}
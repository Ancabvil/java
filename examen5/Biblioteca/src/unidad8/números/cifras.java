package unidad8.números;
/**
 * @author Antonio Manuel Cabrera Villarejo
 * @param numPedido es el número que vamos a buscar en el array
 * @param numeroIntro es el número que introducimos para darle tamaño al array
 */
public class cifras {
    public static boolean ContieneCifra (int numero, int cifra){
        
       String numStr = Integer.toString(numero);
       String cifraStr = Integer.toString(cifra);
        return numStr.contains(cifraStr);
    }
}
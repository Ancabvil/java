package unidad8.números;
/**
 * @author Antonio Manuel Cabrera Villarejo
 * @param numPedido es el número que vamos a buscar en el array
 * @param numeroIntro es el número que introducimos para darle tamaño al array
 */
public class cifras {
    public static boolean ContieneCifra (int numPedido, int numeroIntro){
        
        //Controlamos el booleano aquí
        boolean contiene =false;
        //creo un array para guardar resultados x para compararlos luego con el numPedido
        int numBase[]  = new int[numeroIntro];
        numBase[0] = 1;
        numBase[1] = 2;
        numBase[2] = 3;
        numBase[3] = 4;
        numBase[4] = 5;
        numBase[5] = 6;
        numBase[6] = 7;
        //Inicializo el Array y comparo los resultado con el buscado
        for (int i = 0; i < numeroIntro; i++) {
            //Si el número existe dentro del aray cambia la condicion del boolean a True
            if(numBase[i] == numPedido){ 
                contiene = true;
            }
        }
        //Devuelve el boolean como resulte
        return contiene;
    }
}
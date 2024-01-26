package funciones;

public class maximoArrayInt {
    public static int MaximoArrayInt(int x[]){

        int maximo = Integer.MIN_VALUE;

        for(int n : x){
    
        if (n > maximo){
            maximo = n;
        }
    }return maximo;
}}

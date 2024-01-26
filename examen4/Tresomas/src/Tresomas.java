public class Tresomas {
    public static void main(String[] args) throws Exception {
        System.out.println("Tres o más.");
//Declaro aquí las variables que utilizare
        int tirada[] = new int[6];
        boolean fin = false;
        int jugadorPuntos [] = new int[6];
        int puntos = 0;
//Uso un while para iterar hasta que la condición fin se cumple, que se chequea tras el último for
        while (fin != true) {
//Este for lo uso para el total de tiradas        
        for (int j = 1; j < 11; j++) {
//Este for sirve para mostrar el jugador y la tirada
        for (int i = 1; i < 3; i++) {
                System.out.print("Tirada " + j + " del jugador " + i + " ");

                for (int f = 0; f < 5; f++) {
//uso una función que está fuera del código para pintar los datos
                tiradaDados(tirada);
                System.out.print(tirada[i]);
//igualo el array de tirada con el de puntos del jugador  
                }
                for (int k = 0; k < jugadorPuntos.length; k++) {
                    jugadorPuntos[i]=tirada[i];
//compruebo las veces que se repite un número en el array para contabilizar los puntos con una serie de elseifs
                if(tirada[i] == jugadorPuntos[k]){
                    puntos +=3;
                    }else if (tirada[i] == jugadorPuntos[k]+1){
                    puntos +=5;
                    }else if(tirada[i] == jugadorPuntos[k]+2){
                    puntos +=12;                }}
                    System.out.println(" "+ puntos + " puntos \n");}
//marco la salida del while con el boolean fin
        fin = true;
    }
    }
    System.out.println("Fin de la partida");
    System.out.println("Ha ganado el jugador con " + puntos + " puntos");
    }
//esta es la función para pintar los datos en la consola
    static void tiradaDados (int tirada[]){
        for (int i = 0; i < 5; i++) {
            int resultado = (int)(Math.random()*5+1);
            tirada[i]=resultado;
    }
}}

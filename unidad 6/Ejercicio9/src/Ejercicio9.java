public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Números aleatorios hasta 24");

        int i=0;
        int contador = 0;
        while( i != 24){
        i = (int)(Math.random()*51)*2;
        if (i %2 == 0){
                System.out.print(i + " ");
                            } 
            contador++;
        }
        System.out.println();
        System.out.println("Se han generado " + contador + " números.");    
        }}
    
        
        
    


public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Loteria");
        int resultado = 0;
        int columnas =3 ; 
        
        for(int i =1; i <= 15; i++){
            System.out.printf("%4d. |", i);
            if (i == 15){
                columnas = 1;
            }
            
            for(int apuesta = 1; apuesta <= columnas; apuesta++)
                
            resultado = (int) (Math.random()*3)+1;
            switch (resultado) {
            case 0:
            System.out.print("1 - -|"); 
                break;
            case 1:
            System.out.print("- X -|");
                break;
            case 2:
            System.out.print("- - 2|");
                break;
            default:
                break;
        }
        }
        System.out.println();
    }
}

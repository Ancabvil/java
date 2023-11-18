public class Ejercicio20 {
    public static void main(String[] args) throws Exception {
        System.out.println("Imprime pirámide hueca.");
        System.out.print("Introduzca la altura:");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el carácter a mostrar:");
        String caracter = System.console().readLine();
        int i = 0;
        int ancho = 1;
        int espacios = altura - 1;
        int huecos = 0;

        while (ancho < altura){

            for( i = 1; i <= espacios; i++){
                System.out.print(" ");
            }
                System.out.print(caracter);
            
                for( i = 1; i < huecos; i++){
                System.out.print(" ");
            }
            if (altura>1){
                System.out.print(caracter);
            }


    System.out.println(" ");
    ancho++;
    espacios--;
    huecos+=2;
        }
        for( i = 1; i <altura*2; i++){
            System.out.print(caracter);
        }
    }
}

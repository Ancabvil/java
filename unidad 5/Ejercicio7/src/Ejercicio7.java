public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca el código de la caja fuerte.");
        int codigo = 5733;
        System.out.print("Introduzca un código de cuatro cifras:");
        String code = System.console().readLine();
        int pass = Integer.parseInt(code);
        int i = 4;
        if (pass == codigo) {
            System.out.println("El código es correcto, ha abierto la caja fuerte.");            
        } else {
            while (pass != codigo) {
                System.out.printf("Código incorrecto, le quedan  %1d " , i , " intentos");
                i--;
                
            }
        }
    }
}

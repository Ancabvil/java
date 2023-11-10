public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca el código de la caja fuerte.");
        int codigo = 5733;
        int i = 4;
        int pass;
        boolean acierto = false;
        do{
        System.out.print("Codigo: ");
        pass = Integer.parseInt(System.console().readLine());
        if (pass==codigo) {
            acierto = true;            
            }else{
            System.out.println("Clave incorrecta.");
            }
            i--;
            }   while ((i > 0) && (!acierto));
                if (acierto){
                System.out.println("El Código es correcto, se abre la caja fuerte.");
                }else{
                System.out.println("No le quedan intentos");
                }        
            }
        }
    
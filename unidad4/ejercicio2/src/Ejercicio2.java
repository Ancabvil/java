public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        System.out.println("¿Digame que hora es!");
        String hora = System.console().readLine();
        int n= Integer.parseInt(hora);


        if (n >= 0 && n <=5){
            System.out.println("¡Buenas noches!");
        }
        
        if (n >= 6 && n <= 12){
            System.out.println("¡Buenos días!");
        }

        if (n >= 13 && n <= 20){
            System.out.println("¡Buenas tardes!");
        }

        if (n >= 21){
            System.out.println("¡Buenas noches!");
        }
        }
    }


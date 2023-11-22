public class Ejercicio28 {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        int contador = 1;
        int numero = num;
        
        for( int i = 1; i <= numero; i++){
            contador =contador*i;
        }
        
        System.out.println(num + "! = " + contador);
    }
    }


public class Ejercicio16 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un número y te digo si es o no primo.");
        System.out.print("Introduzca el número:");
        int num = Integer.parseInt(System.console().readLine());
        boolean esPrimo=true;

        for(int i = 2; i< num; i++){
            if ((num % i)==0){
                esPrimo=false;
            }
        } if (esPrimo){
            System.out.println("El número es primo.");
        }else{
            System.out.println("El número no es primo.");
        }
    }
}

public class Ejercicio36 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca un número para saber si es o no capicúa.");
        System.out.print("Introduzca el número: ");
        int numeroIntro = Integer.parseInt(System.console().readLine());
        int numero = numeroIntro;
        int voltea=0;
        
        while (numero > 0){
        voltea = (voltea*10)+(numero%10);
        numero /=10;
        }
        
        if (numeroIntro == voltea){
            System.out.println("El número es capicúa.");
        } else{
            System.out.println("El número no es capicúa.");
        }
    }
}

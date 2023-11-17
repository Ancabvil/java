public class Ejercicio18 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca dos números y le muestro los números comprendidos entre ambos de 7 en 7");
        System.out.print("Introduzca el primer número:");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el segundo número:");
        int num2 = Integer.parseInt(System.console().readLine());

        if (num1 == num2){
            System.out.println("No pueden ingresarse números iguales.");
        } if(num1 < num2){
            for(int i = num1; i <= num2; i+=7){
                System.out.print(i + " ");
            }
        } if(num1 > num2){
            for(int i = num2; i <= num1; i+=7){
                System.out.print(i + " ");
        }
    }
}
}
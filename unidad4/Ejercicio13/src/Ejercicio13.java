public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        System.out.println("Le ordeno los números de mayor a menor");
        System.out.println("Introduzca un número");
        String a = System.console().readLine();
        int num1 = Integer.parseInt(a);
        System.out.println("Introduce otro número");
        String b = System.console().readLine();
        int num2 = Integer.parseInt(b);
        System.out.println("Introduzca el último número");
        String c = System.console().readLine();
        int num3 = Integer.parseInt(c);

        if (num1 > num2 && num1 > num3){
            if (num2 > num3){
                System.out.println("El orden es "+ num1 + num2 + num3);
            }else{
                System.out.println("El orden es " + num1 + num3 + num2);
            }
        }
        if (num2 > num1 && num2 > num3){
            if (num1 > num3){
                System.out.println("El orden es "+ num2 + num1 + num3);
            }else{
                System.out.println("El orden es " + num2 + num3 + num1);
            }
        }
        if (num3 > num1 && num3 > num2){
            if (num2 > num1){
                System.out.println("El orden es "+ num3 + num2 + num1);
            }else{
                System.out.println("El orden es " + num3 + num1 + num2);
            }
        }
    }
}

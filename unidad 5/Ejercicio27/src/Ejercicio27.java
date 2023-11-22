public class Ejercicio27 {
    public static void main(String[] args) throws Exception {
        System.out.println("Muestra, cuenta y suma los multiplos de 3 entre valores.");
        System.out.print("Introduce el primer valor: ");
        int primerValor = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el segundo valor: ");
        int segundoValor = Integer.parseInt(System.console().readLine());
        int contador = 0;
        int suma = 0;
        for(int i = primerValor; i <= segundoValor; i+=3){
            System.out.println(i);
            contador++;
            suma +=i;
        }
        System.out.println("Hay " + contador + " números.");
        System.out.println("La suma de los valores es " + suma);

    }
}

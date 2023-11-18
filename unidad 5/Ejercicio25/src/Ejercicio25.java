public class Ejercicio25 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número:");

        int numIntro=Integer.parseInt(System.console().readLine());
        int numero = numIntro;
        int numReves= 0;

        while (numero > 0) {
            numReves = (numReves * 10) + (numero %10);
            numero /= 10;
        }
        System.out.println("Si le damos la vuelta al "+ numIntro + " tenemos el " + numReves);
    }
}

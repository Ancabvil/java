public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Le calculo el tiempo de caida de un objeto solo con la altura.");
        double g= 9.81;
        String h = System.console().readLine();
        double alt = Double.parseDouble(h);
        double caida = Math.sqrt(2*alt/g);
        System.out.println("El tiempo de caida del objeto con " + alt + " de altura es " + caida);
    }
}

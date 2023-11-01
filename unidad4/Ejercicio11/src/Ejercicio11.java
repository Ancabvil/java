public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculemos cuantos segundos quedan hasta medianoche.");
        System.out.println("Introduzca la hora");
        String a = System.console().readLine();
        int hora = Integer.parseInt(a);
        System.out.println("Introduzca los minutos");
        String b = System.console().readLine();
        int minutos = Integer.parseInt(b);
        int totalseg = (hora * 3600) + (minutos * 60);
        int segdia = 24 * 3600;
        System.out.println("Quedan para medianoche " + (segdia - totalseg) + " segundos");
    }
}

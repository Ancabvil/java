public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculemos la media obtenida en el curso");
        System.out.println("Introduzca la nota de la primera evaluación");
        String ev1 = System.console().readLine();
        Double n1 = Double.parseDouble(ev1);
        System.out.println("Introduzca la nota de la segunda evaluación");
        String ev2 = System.console().readLine();
        Double n2 = Double.parseDouble(ev2);
        System.out.println("Introduzca la nota de la tercera evaluación");
        String ev3 = System.console().readLine();
        Double n3 = Double.parseDouble(ev3);
        Double fin = (n1 + n2 + n3)/3;
        System.out.println("La media del curso es de " + fin);
    }
}

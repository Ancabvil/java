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
    
        if (fin < 4.9) {
            System.out.print("Tu media es de " + fin + " por lo que es insuficiente");
        }

        if (fin >= 5.9 && fin <= 6.9) {
            System.out.println("Tu media es de " + fin + " por lo que es suficiente");
        }
        if (fin >= 7 && fin <= 7.9) {
            System.out.println("Tu media es de " + fin + " por lo que es un bien");
        }
        if (fin >=8 && fin <= 9) {
            System.out.println("Tu media es de " + fin + " por lo que es un notable");
        }
        if (fin >=9.1) {
            System.out.println("Tu media es de " + fin + " por lo que es un sobresaliente");
        }
        }


    }


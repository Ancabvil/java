public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Te resuelvo este tipo de ecuación ax2 + bx + c = 0");
        System.out.println("Introduce el valor para a");
        System.out.printf("  ñ " );
        String num1 = System.console().readLine();
        double a = Double.parseDouble(num1);
        System.out.println("Introduce el valor para b");
        String num2 = System.console().readLine();
        double b = Double.parseDouble(num2);
        System.out.println("Introduce el valor para c");
        String num3 = System.console().readLine();
        double c = Double.parseDouble(num3);

        double raiz = (Math.pow(b, 2) - (4 * a * c));

        if(raiz >= 0){
            if (raiz == 0){
            
                double sol1 = ((-b) - (4 * a * c))/(2 * a);
                System.out.println("Solo hay una solución, que es " + sol1);
                } else {
                    double sol2 = ((-b) - (4 * a * c) / (2 * a));
                    double sol3 = ((-b) + (4 * a * c) / (2 * a));
                    System.out.println("La ecuación tiene dos soluciones, estas son " + sol2 + " y " + sol3);
                }
        } else{
            System.out.println("La ecuación no tiene solución");
        }
    }
}

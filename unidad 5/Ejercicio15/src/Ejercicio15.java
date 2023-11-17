public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca una base y una potencia.");
        System.out.println("El programa expondrá la base hasta esa potencia en sucesión.");
        System.out.print("Introduzca la base: ");
        double base = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce la potencia: ");
        int potFinal = Integer.parseInt(System.console().readLine());
        double potencia;
        int exponente;
        for (int i = 1; i <= potFinal; i++){
            potencia = 1;
            exponente = i;

            for (int j = 0; j < exponente; j++){
                potencia *= base;
            }
        
    System.out.println(base + "^" + i + " = " + potencia);
    }
}
    
}

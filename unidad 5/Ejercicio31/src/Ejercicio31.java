public class Ejercicio31 {
    public static void main(String[] args) throws Exception {
        System.out.println("Con una altura dada se pinta una L con ancho igual a la mitad de esta.");
        System.out.print("Ingrese la altura: ");
        int altura = Integer.parseInt(System.console().readLine());
        for (int i = 1; i < altura; i++){
            System.out.println("*");
        }
        int base = altura/2;
        for (int i = 1; i <= base; i++){
            System.out.print("*");
        }
    }
}

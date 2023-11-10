public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        System.out.println("Tabla de multiplicar.");
        System.out.print("Introduzca un número:");
        int num = Integer.parseInt(System.console().readLine());
        for(int i = 1; i < 11; i++){
            System.out.println(num + "x" + i + "=" +  num * i);
        }
    }
}

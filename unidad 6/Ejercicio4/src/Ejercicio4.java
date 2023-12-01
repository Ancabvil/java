public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Números aleatorios entre 0 y 10");
        for (int i = 0; i <20; i++){
        int num = (int) (Math.random()*10+1);
        System.out.print(num + " ");
        }
    }
}

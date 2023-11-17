public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        System.out.println("Te cuento 100 números desde el número introducido.");
        System.out.print("Introduce el número: ");
        int num = Integer.parseInt(System.console().readLine());
        if(num >= 0){
        for(int i = num ; i < (num +100);i++){
            System.out.println(i);
        }} else {
            System.out.println("Números negativos no funcionan.");
        }
    }
}

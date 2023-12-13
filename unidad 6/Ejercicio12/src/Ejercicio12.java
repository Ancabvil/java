public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        System.out.println("Matrix!");
        System.out.print("\033[32m");
        for(int i = 0; i <50; i++){
            System.out.println();
            for(int j = 0; j <50; j++){
        char matrix = (char) ((Math.random()*94)+ 32);
        System.out.printf(" %c ", matrix);
    }}
    }
}

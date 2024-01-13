public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Pide 8 números y te dice si par o impar");


        int num[] = new int[8];
        for (int i=0; i<8 ;i++) {
            System.out.print("Introduce un número: ");
            int intro = Integer.parseInt(System.console().readLine());
            num[i]=intro;        
        }

        for (int i=0; i <= 7; i++) {
            if(num[i] %2 ==0){
                System.out.println(num[i] + " es par");
            }else{
                System.out.println(num[i] + " es impar");
            }
        }
        
    }
}

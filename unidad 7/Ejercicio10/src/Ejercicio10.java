public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Array de pares e impares.");

        int num[] = new int[20];
        int numpar[] = new int[20];
        int numimpar[] = new int[20];
        
        for (int i=0; i<20; i++ ) {
           int numero=(int)((Math.random()*100)+1);
           num[i]=numero;
        }
        
        for (int i= 0 ; i < 20; i++) {
            if (num[i] %2 ==0) {
                numpar[i]= num[i];
                System.out.println(num[i] + " par");
            }else{
                numimpar[i]= num[i];
                System.out.println(num[i] + " impar");
            }
        }
        for(int i = 0; i < 20; i++){
            num[i]= numpar[i] + numimpar[i];
            
            System.out.println(num[i]);
        }
        
    }
}

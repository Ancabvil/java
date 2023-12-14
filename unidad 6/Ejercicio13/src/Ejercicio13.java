public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        System.out.println("Tirada de dados.");
        int dado1=1;
        int dado2=2;
            while(dado1 != dado2){
                
        dado1 = (int)(Math.random()*5)+1;
        dado2 = (int)(Math.random()*5)+1;
                System.out.println("Ha salido " + dado1 + " y " + dado2);
            }

            if(dado1 == dado2){
                System.out.println("Han salido iguales!! El " + dado1 + " y el " + dado2);
            }

        
    }
}

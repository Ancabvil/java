public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce 10 números y distingue signo.");
        int negativos = 0;
        int positivos = 0;

        for(int i = 0; i <10; i++){
            if (Integer.parseInt(System.console().readLine()) < 0){
                negativos ++;
            }else {
                positivos++;
            }
        }
        System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " y negativos.");

}
}
public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        System.out.println("Le calculo la potencia de un numero dado");
        System.out.print("Introduzca el número a elevar:");
        int num = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la potencia:");
        int pot = Integer.parseInt(System.console().readLine());

        double potencia = 1;
         if (pot == 0){
            potencia = 1;
         }
         if (pot > 0){
            for (int i = 0; i < pot; i++){
                potencia *= num;
            }
        }
        if ( pot < 0 ){
            for(int i = 0 ; i < -pot; i++){
                potencia *= pot;
            }
            pot = 1/pot;
        }
        System.out.println(num + "^" + pot + "=" + potencia);
    }
}

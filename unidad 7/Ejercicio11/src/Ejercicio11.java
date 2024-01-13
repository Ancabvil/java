public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        System.out.println("Pide 10 números y ordena los primos en las primeras posiciones");
        
        int num[] = new int[10];
        int primo[] = new int[10];
        int noprimo[] = new int[10];
        int i;
        int j;
        int primos=0;
        int noprimos=0;
        boolean esPrimo=false;
        for(i = 0; i < 10; i++){
            System.out.print("Introduzca un valor: ");
            int valor = Integer.parseInt(System.console().readLine());
            num[i]=valor;
        }
        esPrimo=true;
        for(j=0;j < num.length; j++){
            if (num[i]%j==0) {
                esPrimo=false;
            }
        }
        if(esPrimo){
            primo[primos++]=num[i];
        }else{
            noprimo[noprimos++]=num[i];
        }

        System.out.println("Índice    0    1    2    3    4    5    6    7    8    9    ");
        System.out.println("------------------------------------------------------------");
        System.out.print(" Valor");
        for( i =0; i<10; i++){
            System.out.print("    "+ num[i]);
        }

        for(i=0; i<primos; i++){
            num[i] = primo[i];
        }

        for(i=primos; i < primos + noprimos; i++){
            num[i] = noprimo[i - primos];
        }
        System.out.println();
        System.out.println("Índice    0    1    2    3    4    5    6    7    8    9    ");
        System.out.println("------------------------------------------------------------");
        System.out.print(" Valor");
        for( i =0; i<10; i++){
            System.out.print("    "+ num[i]);
        }
    }
}

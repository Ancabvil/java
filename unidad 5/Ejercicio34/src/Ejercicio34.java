public class Ejercicio34 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca 2 números para ordenar pares e impares en diferentes columnas.");
        System.out.print("Introduzca un número: ");
        long numIntro1 = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca un segundo número: ");
        long numIntro2 = Long.parseLong(System.console().readLine());

        long num = numIntro1;
        
        long volteadoA=0;
        
        long longitud=0;


        if(num == 0){
            longitud=1;
        }
//Voltea el primer número
        while (num > 0) {
            volteadoA = (volteadoA * 10) + (num % 10);
            num /= 10;
            longitud++;
          }
        num = numIntro2;
        long volteadoB=0;
      
//Voltea el segundo número
        while (num > 0) {
            volteadoB = (volteadoB *10) + (num %10);
            num/= 10;
            longitud++;
        }
//variables para los resultados y el contador.
        long resultadoPar = 0;
        long resultadoImpar = 0;
        int digito;

        for (int i = 0 ; i < longitud; i++){
           
            digito = (int)(volteadoA % 10);
            if (digito % 2 ==0) {
                resultadoPar = resultadoPar *10 + digito;
            } else{
                resultadoImpar = resultadoImpar*10 + digito;
            }
            digito = (int)(volteadoB % 10);
            if (digito % 2 ==0) {
                resultadoPar = resultadoPar *10 + digito;
            } else{
                resultadoImpar = resultadoImpar*10 + digito;
            }
            volteadoA /=10;
            volteadoB /=10;
        }
        System.out.println("El resultado par es " + resultadoPar);
        System.out.println("El resultado impar es " + resultadoImpar);
    }
    }

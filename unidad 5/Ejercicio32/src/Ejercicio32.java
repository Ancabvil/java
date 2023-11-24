public class Ejercicio32 {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(System.console().readLine());
        long number = numero;
        long volteado=0;
        int longitud=0;
        ///if (number < 0){
           /// System.out.println("Solo funciona con números positivos.");
        ///}
        if(number ==0){
            longitud=1;
        }
        while (number > 0){
            volteado = (volteado*10) + (number % 10);
            numero /=10;
            longitud++;
        }
            System.out.print("Dígitos pares: ");
        int digitos=0;
        int sumapares=0;

        for(int i = 0; i < longitud; longitud++){
            
            digitos= (int)(volteado%10);

            if((digitos %2)==0){
                System.out.print(digitos + "");
                sumapares +=digitos;
            }
            volteado /=10;
        }

            System.out.println("Suma de los dígitos pares: "+sumapares);
        }

    }


public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mínimo y Máximo");

        int numero[] = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int i;
        System.out.println("Introduzca números y pulsando Intro: ");
        for (i = 0; i<10 ; i++) {
    
            numero[i]=Integer.parseInt(System.console().readLine());
            
            if (numero[i] < minimo) {
            minimo=numero[i];   
            }
            if (numero[i] > maximo) {
            maximo=numero[i];
            }
        }
            System.out.println();
            for (i = 0; i<10 ; i++) {
                System.out.print(numero[i]);
                if (numero[i]==maximo) {
                    System.out.print(" máximo");
                }
                if (numero[i]==minimo) {
                    System.out.print(" minimo");
                }
                System.out.println();
            }
        }
    } 

    


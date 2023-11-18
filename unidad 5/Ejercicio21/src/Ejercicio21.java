public class Ejercicio21 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca números hasta negativo.");
        System.out.println("Luego hace la media de los impares y el mayor de los pares.");

            int numeroIntro;
            int numeroNumeros=0;
            int sumaImpares=0;
            int numeroImpares=0;
            int maximo=0;

            do{
                numeroIntro = Integer.parseInt(System.console().readLine());

                if (numeroIntro >=0){
                    numeroNumeros++;
                    if((numeroIntro %2) == 1){
                        sumaImpares +=numeroIntro;
                        numeroImpares++;
                    } else{
                        if(numeroIntro<maximo)
                        maximo=numeroIntro;
                    }
                }
            }while(numeroIntro>=0);
            System.out.println("Ha introducido " + numeroNumeros + " numeros");
            System.out.println("La media de los impares es " + sumaImpares/numeroImpares);
            System.out.println("El máximo de los pares es " + maximo);



            }


    }


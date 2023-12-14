public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        System.out.println("Adivino un número que pienses del 0 al 100.");

        int numero = 0;
        int intentos = 5;
        String correcto;
        int maximo = 100;
        int minimo = 0;

        do{
            numero = (int)((Math.random()*100)+1);
            System.out.print("Es tu número el " + numero + " ?");
            correcto=System.console().readLine();
            correcto.toLowerCase();
            if(correcto.equals("no")){
            intentos--;
            System.out.println("Te quedan " + intentos + " intentos.");
            System.out.println("¿Es mayor o menor al número?");
            String respuesta=System.console().readLine();
            respuesta.toLowerCase();
            switch (respuesta) {
                case "mayor":
                    maximo = (100 - numero)-1;
                    numero= (int)((Math.random()*maximo)+1);
                    break;
                case "menor":
                    minimo = (0 + numero)+1;
                    numero= (int)((Math.random()*minimo)+1);
                    break;
                default:
                    System.out.println("Esa respuesta no está registrada.");
                    break;
                }    
            }
        }
        while (correcto.equals("no"));
        {
            if(correcto.equals("si") ){
                System.out.println("He acertado!");
            }
            }
            if(intentos == 0){
                System.out.println("No le quedan intentos.");
            }
    }
    
}

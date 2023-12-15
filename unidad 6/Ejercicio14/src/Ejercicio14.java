public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        System.out.println("Adivino un número que pienses del 0 al 100.");

        int numero = 0;
        int intentos = 5;
        String correcto;
        int maximo = 100;
        int minimo = 0;

        do{
            numero = (int)((Math.random()*(maximo - minimo))+ minimo);
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
                case "menor":
                    maximo = numero - 1;
                    break;
                case "mayor":
                    minimo = numero + 1;
                    break;
                default:
                    System.out.println("Esa respuesta no está registrada.");
                    break;
                }   
                if(intentos == 0){
                System.out.println("No le quedan intentos.");
            } 
            } else{
                System.out.println("He acertado!");
            }
        }
        while (correcto.equals("no"));
    }
    
}

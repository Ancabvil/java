public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca un día de la semana:");
        String respuesta = System.console().readLine();

        switch(respuesta){
            case "Lunes":
            System.out.println("Tienes clase de programación");
            break;
            case "Martes":
            System.out.println("Tienes clase de Bases de datos");
            break;
            case "Miercoles":
            System.out.println("Tienes clase de Lenguaje de Marcas");
            break;
            case "Jueves":
            System.out.println("Tienes clase de FOL");
            break;
            case "Viernes":
            System.out.println("Tienes clase de Sistemas");
            break;
            default:
            System.out.println("Eso no es un día de la semana");
            break;
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un número del 1 al 7");
        int dia = Integer.parseInt(System.console().readLine());
        

        switch (dia) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("Eso no es un día de la semana");
                break;
        }
    }
}

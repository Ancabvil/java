public class Ejercicioadd2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un número y te digo que día de la semana es");
        System.out.println("Introduce un número de 1 al 7");
        String a = System.console().readLine();
        int num = Integer.parseInt(a);
        switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3: 
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
                default:
                System.out.println("Eso no es un día de la semana");
                break;
        }
    }
}

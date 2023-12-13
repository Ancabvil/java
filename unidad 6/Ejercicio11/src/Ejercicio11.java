public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        System.out.println(" 20 Notas al azar.");
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;
        for (int i = 1; i <= 20; i++){
        int valor =(int) (Math.random()*10);
        String nota = "";
        switch (valor) {
            case 0, 1, 2, 3, 4:
                nota = "Suspenso";
                suspenso++;
                break;
            case 5:
                nota = "Suficiente";
                suficiente++;
                break;
            case 6:
                nota = "Bien";
                bien++;
                break;
            case 7, 8:
                nota = "Notable";
                notable++;
                break;
            case 9, 10:
                nota = "Sobresaliente";
                sobresaliente++;
                break;
            default:
                break;
        }
    System.out.println("La nota es " + valor + " o sea un " + nota);
    
}
System.out.println("Hay "+ suspenso + " insuficientes" );
    System.out.println("Hay " + suficiente + " suficientes");
    System.out.println("Hay " + bien + " bien.");
    System.out.println("Hay " + notable + " notables.");
    System.out.println("Hay " + sobresaliente + " sobresalientes.");

    }
}

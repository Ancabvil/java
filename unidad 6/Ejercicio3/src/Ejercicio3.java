public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Elije una carta de la baraja española aleatóriamente.");
        int palo = (int)(Math.random()*4+1);
        
        String Palo="";
        switch (palo) {
            case 1:
                Palo = "bastos";
                break;
            case 2:
                Palo = "espadas";
                break;
            case 3:
                Palo = "copas";
                break;
            case 4:
                Palo = "oros";
                break;
            default:
                break;
        }
        String Carta ="";
        int carta = (int)(Math.random()*10+1);
        switch (carta) {
            case 1:
                Carta = "As";
                break;
            case 8:
                Carta = "Sota";
                break;
            case 9:
                Carta = "Caballo";
                break;
            case 10:
                Carta = "Rey";
                break;
        
            default:
            Carta = String.valueOf(carta);
                break;
        }
        System.out.println(Carta + " de " + Palo);
    }
}

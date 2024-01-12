public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Rellena un array y lo desplaza.");
        int numero[] = new int[15];
        System.out.println("Introduce un número y pulsa Intro: ");
        for (int i =0; i < numero.length; i++) {
        numero[i]=Integer.parseInt(System.console().readLine());
    }
        for (int i=0; i < 15; i++) {
            System.out.println(numero[i]);
        }
        int aux = numero[14];
        for(int i = 14; i >0; i--){
            numero[i]=numero[i-1];
        }
        numero[0]=aux;
        for(int i=0; i < numero.length; i++){
        System.out.println(numero[i]);
    }
            }
}

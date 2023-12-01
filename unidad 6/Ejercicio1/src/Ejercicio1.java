public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Tira tres dados y suma los resultados.");
        int suma=0;
        for(int i = 0; i <3; i++){
        int dado = (int) (Math.random()*6+1);
        System.out.println("El resultado es " + dado);
        suma+=dado;
    }
        System.out.println("La suma de los dados es " + suma);
    }
}

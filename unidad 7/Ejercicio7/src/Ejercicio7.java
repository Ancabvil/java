public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Genera números y sustituye");

        int val[] = new int[100];
        for (int i=0; i < 100; i++) {
        int num = (int)((Math.random()*20)+1);   
            val[i]=num;
    }
    System.out.println("Array original");
    for (int i : val) {
        System.out.println(val[i]);
    }
        System.out.println("Introduce dos valores, el segundo sustituye al primero en el array.");
        System.out.print("Primer valor: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("El segundo valor: ");
        int num2 = Integer.parseInt(System.console().readLine());
        for (int i : val) {
        if (val[i] == num1){
            val[i]=num2;
        }
    }
    
    for (int i : val) {
        System.out.println(val[i]);    
    }
    
    }
}

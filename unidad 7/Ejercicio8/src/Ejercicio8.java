public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        System.out.println("El tiempo.");
        String[] mes = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
            };
            
        int temperatura[] = new int[12];
        int f;
        int j;
    for (int i=0; i<12;i++) {
        System.out.print("Introduce la temperatura de " + mes[i] + " :");
        int temp = Integer.parseInt(System.console().readLine());
        temperatura[i]=temp;
    }    
    
for ( j=0; j < 12; j++) {
    int temp = temperatura[j] ;
        System.out.print(mes[j] + " " + temp +  " ");
        for ( f = 0; f < temperatura[j]; f++) {
            System.out.print("*");
            }
    System.out.println();
}
    }
}

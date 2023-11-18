public class Ejercicio19 {
    public static void main(String[] args) throws Exception {
        System.out.println("Le pinto una pirámide de n columnas y el carácter que quiera.");
        System.out.print("Introduzca la altura: ");
        int alt = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el carácter: ");
        String chara = System.console().readLine();
        int ancho = 1;
        int longitud = 1;
        int espacios = alt -1;
        while(ancho <= alt){
            for (int i = 1; i <= espacios; i++){
            System.out.print(" ");
            }
            for(int i = 1; i <= longitud; i++){
                System.out.print(chara);
            }
        System.out.println(" ");
        
        ancho++;
        espacios--;
        longitud+=2;}}
    }


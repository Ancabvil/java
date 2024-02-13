public class Ejercicio1Array {
    public static void main(String[] args) throws Exception {
    
        Gato[] gato = new Gato[4];
        int i;

        for ( i = 0; i < 4; i++) {
            gato[i]=new Gato();
            System.out.println("  /nGato nº " + (i+1));
            System.out.print("Nombre: ");
            gato[i].setNombre(System.console().readLine());
            System.out.print("Color: ");
            gato[i].setColor(System.console().readLine());
            System.out.print("Edad :");
            gato[i].setEdad(Integer.parseInt(System.console().readLine()));
        }

        System.out.println("Datos de los gatos");

        for (i= 0; i < 4; i++) {
            System.out.println("Gato nº " + (i+1));
            System.out.println("Nombre: " + gato[i].getNombre());
            System.out.println("Color: " + gato[i].getColor());
            System.out.println("Edad: " + gato[i].getEdad());
            
        }
    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Ciudad ---- Código Postal");

        ArrayList <String> ciudad = new ArrayList<>();
        ArrayList <Integer> codigoPostal = new ArrayList<>();
        HashMap<ArrayList<Ciudad>, ArrayList<CodigoPostal>> ciuidadMap = new HashMap<>();
int contCiu = 0;
int contCod = 0;
        boolean salir = false;
do {
    System.out.println("Menu: ");
    System.out.println("1. Introducir Ciudad");
    System.out.println("2. Introducir Código Postal");
    System.out.println("3. Mostrar tabla");
    System.out.println("4. Borrar Ciudad");
    System.out.println("5. Borrar Código Postal");
    System.out.println("6. Salir");
int opcion = Integer.parseInt(System.console().readLine());
    
switch (opcion) {
    case 1:
        System.out.print("Introduzca el nombre de la ciudad: ");
        String city = System.console().readLine();
        ciudad.set(contCiu, city);
        contCiu++;
        break;

    case 2:
        System.out.print("Introduzca el Código postal: ");
        int cod = Integer.parseInt(System.console().readLine());
        codigoPostal.set(contCod, cod);
        contCod++;
        break;
    case 3:
        ciuidadMap.toString();
        break;
    case 4:
        System.out.print("Inserte la posición de la ciudad que quiere borrar: ");
        int rmCiu = Integer.parseInt(System.console().readLine());
        ciudad.remove(rmCiu);
        break;
    case 5:
        System.out.println("Inserte la posición del Código Postal que quiere borrar: ");
        int rmCod = Integer.parseInt(System.console().readLine());
        codigoPostal.remove(rmCod);
        break;
    case 6:
        salir = true;
        System.out.println("Hasta luego.");
    default:
        break;
}

} while (salir != false);

        }
    }
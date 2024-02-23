import java.util.ArrayList;
import java.util.HashMap;

public class prueba {
    public static void main(String[] args) throws Exception {
        System.out.println("Ciudad ---- Código Postal");

        ArrayList <Ciudad> ciudad = new ArrayList<>();
        ArrayList <CodigoPostal> codigoPostal = new ArrayList<>();
        HashMap<ArrayList<Ciudad>, ArrayList<CodigoPostal>> ciuidadMap = new HashMap<>();
        boolean salir = false;
do {
    System.out.println("Menu: ");
    System.out.println("1. Introducir Ciudad");
    System.out.println("2. Introducir Código Postal");
    System.out.println("3. Añadir datos al hashmap");
    System.out.println("4. Mostrar tabla");
    System.out.println("5. Borrar Ciudad");
    System.out.println("6. Borrar Código Postal");
    System.out.println("7. Ordenar los Códigos postales por ciudad");
    System.out.println("8. Salir");
int opcion = Integer.parseInt(System.console().readLine());
    
switch (opcion) {
    case 1:
        System.out.print("Introduzca el nombre de la ciudad: ");
        String city = System.console().readLine();
        Ciudad ciudad1 = new Ciudad(null);
        ciudad.add(ciudad1);
        break;

    case 2:
        System.out.print("Introduzca el Código postal: ");
        int cod = Integer.parseInt(System.console().readLine());
        CodigoPostal codigo = new CodigoPostal();
        codigo.setCodigo(cod);
        break;
    case 3:
    ciuidadMap.put(ciudad, codigoPostal);
        break;
    case 4:
    ciuidadMap.toString();

        break;
    case 5:
    System.out.print("Inserte la posición de la ciudad que quiere borrar: ");
        int rmCiu = Integer.parseInt(System.console().readLine());
        ciudad.remove(rmCiu);


        break;
    case 6:
    System.out.println("Inserte la posición del Código Postal que quiere borrar: ");
        int rmCod = Integer.parseInt(System.console().readLine());
        codigoPostal.remove(rmCod);

        break;
    case 7:
        
break;
case 8:
salir = true;
        System.out.println("Hasta luego.");
break;
        default:
        break;
}

} while (salir != true);

        }
    }
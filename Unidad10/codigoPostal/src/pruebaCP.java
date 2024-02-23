import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class pruebaCP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> mapaCiudades = new HashMap<>();
        
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar ciudad y código postal");
            System.out.println("2. Eliminar ciudad");
            System.out.println("3. Eliminar código postal de una ciudad");
            System.out.println("4. Mostrar mapa de ciudades y códigos postales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del nextInt()
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    String ciudad = scanner.nextLine();
                    System.out.print("Ingrese el código postal: ");
                    String codigoPostal = scanner.nextLine();
                    
                    if (mapaCiudades.containsKey(ciudad)) {
                        mapaCiudades.get(ciudad).add(codigoPostal);
                    } else {
                        ArrayList<String> codigosPostales = new ArrayList<>();
                        codigosPostales.add(codigoPostal);
                        mapaCiudades.put(ciudad, codigosPostales);
                    }
                    System.out.println("Ciudad y código postal agregados correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la ciudad a eliminar: ");
                    ciudad = scanner.nextLine();
                    if (mapaCiudades.containsKey(ciudad)) {
                        mapaCiudades.remove(ciudad);
                        System.out.println("Ciudad eliminada correctamente.");
                    } else {
                        System.out.println("La ciudad no existe en el mapa.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    ciudad = scanner.nextLine();
                    if (mapaCiudades.containsKey(ciudad)) {
                        ArrayList<String> codigosPostales = mapaCiudades.get(ciudad);
                        if (codigosPostales.isEmpty()) {
                            System.out.println("La ciudad no tiene códigos postales asociados.");
                        } else {
                            System.out.println("Códigos postales de la ciudad " + ciudad + ":");
                            for (String codigo : codigosPostales) {
                                System.out.println(codigo);
                            }
                            System.out.print("Ingrese el código postal a eliminar: ");
                            String cpEliminar = scanner.nextLine();
                            codigosPostales.removeIf(codigo -> codigo.equals(cpEliminar));
                            System.out.println("Código postal eliminado correctamente.");
                        }
                    } else {
                        System.out.println("La ciudad no existe en el mapa.");
                    }
                    break;
                case 4:
                    System.out.println("Contenido del mapa de ciudades y códigos postales:");
                    for (String ciudadName : mapaCiudades.keySet()) {
                        System.out.println("Ciudad: " + ciudadName);
                        System.out.println("Códigos postales:");
                        for (String codigo : mapaCiudades.get(ciudadName)) {
                            System.out.println(codigo);
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 5);
        
        scanner.close();
    }
}

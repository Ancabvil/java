public class PruebaLibreto {
    public static void main(String[] args) throws Exception {
        //Aquí creo un booleano para controlar el menú y un libreto nuevo vacio
        boolean salir = false;
        Libreto l = new Libreto();
    do {
System.out.println("Menú de creación de libreto.");
System.out.println("1. Crear libreto");
System.out.println("2. Mostrar libreto");
System.out.println("3. Salir");
System.out.print("Introduzca una opción: ");
int opcion = Integer.parseInt(System.console().readLine());
//Dentro de la primera opción del switch meto las variables con los setter 
switch (opcion) {
    case 1:
    System.out.println("Introduzca identificador: ");
    int id = Integer.parseInt(System.console().readLine());
    l.setIdentificador(id);
    System.out.println("Introduzca nombre: ");
    String nombre = System.console().readLine();
    l.setTitulo(nombre);
    System.out.println("Introduzca el año de publicación: ");
    int year = Integer.parseInt(System.console().readLine());
    l.setAnyoPublicación(year);
        break;
    
//Aquí uso el metodo toString para imprimir por pantalla todo el contenido del objeto l de la clase Libreto
    case 2:
        System.out.println(l.toString());
        break;
    case 3:
    salir = true;
    System.out.println("Gracias, hasta pronto.");
    default:
        break;
}
    } while (salir !=true);

    }
}

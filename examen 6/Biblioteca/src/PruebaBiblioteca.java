public class PruebaBiblioteca {
    public static void main(String[] args) throws Exception {

Libro[] libro = new Libro[3];
int i;
boolean salir = false;
do {
    System.out.println("Biblioteca. Elija una opción: ");
    System.out.println("1. Introduzca un libro");
    System.out.println("2. Tome prestado un libro");
    System.out.println("3. Devuelva un libro");
    System.out.println("4. Imprime el libro");
    System.out.println("5. Salir.");
    int opción = Integer.parseInt(System.console().readLine());

    switch (opción) {
        case 1:
        for (i = 0; i < libro.length; i++) {
            libro[i] = new Libro();
            System.out.println("Introduce el Isbn: ");
            libro[i].setIsbn(System.console().readLine());
            System.out.println("Introduce el título: ");
            libro[i].setTitulo(System.console().readLine());
            System.out.println("Introduce el año de publicación: ");
            libro[i].setYear(Integer.parseInt(System.console().readLine()));}
            break;

        case 2: 
        System.out.println("Introduzca el id: ");
        int id =Integer.parseInt(System.console().readLine());
        libro[id].setPrestado(true);
        break;

        case 3:
        System.out.println("Introduzca el id");
        id =Integer.parseInt(System.console().readLine());
        libro[id].setPrestado(false);
        break;
        case 4:
        System.out.println("Introduzca el id");
        id =Integer.parseInt(System.console().readLine());
        System.out.println(libro[id]);
        case 5:
        salir = true;
        System.out.println("Hasta pronto.");
        default:
            break;
    }
    
}while (salir != false);
}
}
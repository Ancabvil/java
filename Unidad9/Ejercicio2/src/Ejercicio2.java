public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        int opción = 0;
        int km;
Bicicleta bmx = new Bicicleta();
Coche opel = new Coche();
System.out.println("VEHICULOS");
System.out.println("=========");
System.out.println("1. Anda con la bicicleta");
System.out.println("2. Haz el caballito con la bicicleta");
System.out.println("3. Anda con el coche");
System.out.println("4. Quema rueda con el coche");
System.out.println("5. Ver kilometraje de la bicicleta");
System.out.println("6. Ver kilometraje con el coche");
System.out.println("7. Ver kilometraje total");
System.out.println("8. Salir");
System.out.println("Elije una opción(1-8):");

while(opción !=8){
    opción = Integer.parseInt(System.console().readLine());    
    switch (opción) {
        case 1:
            System.out.println("¿Cuantos kilómetros quieres recorrer?");
            km = Integer.parseInt(System.console().readLine());
            bmx.recorre(km);
            break;
        case 2:
        bmx.caballito();
        break;
        case 3:
            System.out.println("¿Cuantos kilómetros quieres recorrer?");
            km = Integer.parseInt(System.console().readLine());
            opel.recorre(km);
            break;
        case 4:
            opel.quemarueda();
            break;
        case 5:
            System.out.print("Has recorrido con la bicicleta: ");
            System.out.println(bmx.getkilometrosRecorridos() + " km");
            break;
        case 6: 
            System.out.print("Has recorrido con el coche: ");
            System.out.println(opel.getkilometrosRecorridos() + " km");
            break;
        case 7:
            System.out.println("En total has recorrido" + Vehiculo.getkilometrosTotales());
            break;
        case 8:
            System.out.println("Gracias y adios.");
        default:
        System.out.println("Esa opción no está contemplada.");
            break;
    }

}
}
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tickets teatro");

        int fila=0;
        int asiento=0;
        char asientos[][] = new char[10][10];
        boolean bandera = false;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos.length; j++) {
                asientos[i][j] = 'L';
            }
        }
System.out.println("--------------------------BIENVENIDOS AL SISTEMA DE RESERVAS--------------------------");
            
while (bandera != true) {
System.out.println("¿Desea ver los asientos disponibles?");    
System.out.print("Pues S para si o cualquier tecla para no: ");
String map = System.console().readLine();
if (map.equalsIgnoreCase("S")) {
    dibujarMapa(asientos);    
}


boolean reserva= false;
while (reserva!=true) {
    System.out.println("Ingrese fila y asiento a reservar");
    System.out.print("Fila (entre 0 y 9): ");
    fila = Integer.parseInt(System.console().readLine());
    System.out.print("Asiento (entre 0 y 9): ");
    asiento = Integer.parseInt(System.console().readLine());
    if( fila>=0 && fila<=9){
        if(asiento>=0 && asiento<=9){
            reserva=true;
        }else{
            System.out.println("El asiento no es válido, ingrese otro.");
        }
    }else{
        System.out.println("La fila no es válida, ingrese otro.");
    }
    
}
if(asientos[fila][asiento] == 'L'){
    asientos[fila][asiento] = 'X';
    System.out.println("El asiento fue reservado correctamente.");
}else{
    System.out.println("El asiento está ocupado. Por favor, elija otro.");
}
System.out.println("¿Desea finalizar la reserva? Pulse S para si o cualquier otro para no.");
String salir = System.console().readLine();
if (salir.equalsIgnoreCase("S")) {
    System.out.println("Gracias por venir.");
    bandera = true;
}
}
    } static void dibujarMapa(char asientos[][]){
        for (int i = 0; i < 10; i++) {
            System.out.print("Fila " +i+" ");
            for (int j = 0; j < 10; j++) {
            System.out.print(" [" + asientos[i][j] + "]");
            }System.out.println();
        }
    }
}

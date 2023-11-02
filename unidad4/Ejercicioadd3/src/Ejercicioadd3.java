public class Ejercicioadd3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca el precio de la entrada en cuestión");
        String a = System.console().readLine();
        double precio = Double.parseDouble(a);

        System.out.println("Elija entre el palco o gallinero (1 o 2)");
        String b = System.console().readLine();
        int seat = Integer.parseInt(b);
        System.out.println("Introduzca el tipo de entrada");
        System.out.println("1 - Invitación");
        System.out.println("2 - Local");
        System.out.println("3 - Foráneo");
        String c = System.console().readLine();
        int type = Integer.parseInt(c);
        
        if ( seat == 1){
            switch (type) {
                case 1:
                    System.out.println("El precio final seria " + (precio -(precio * 0.10)) + " euros");
                    break;
                case 2: 
                    System.out.println("El precio final seria " + precio + " euros");
                    break;
                case 3:
                    System.out.println("El precio final seria " + (precio + (precio * 0.10)) + " euros");
                    break;
                default:
                    break;
            }
        }
        else if ( seat == 2){
            switch (type) {
                case 1:
                    System.out.println("El precio final seria " + (precio - (precio * 0.05)) + " euros");
                    break;
                case 2:
                    System.out.println("El precio final seria " + precio  + " euros");
                    break;
                case 3:
                    System.out.println("El precio final seria " + (precio + (precio * 0.05)) + " euros");
                    break;
                default:
                    break;
            }
        }
        else {
            System.out.println("Ese tipo de sitio no existe");
        }
        }
    }


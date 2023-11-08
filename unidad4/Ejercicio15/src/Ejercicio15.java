public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        System.out.println("Te pinto una pirámide.");
        System.out.print("Introduce que carácter usar:");
        String caracter = System.console().readLine();
        System.out.println("Elija la dirección de la pirámide.");
        System.out.println("1 - Hacia arriba.");
        System.out.println("2 - Hacia abajo.");
        System.out.println("3 - Hacia la izquierda.");
        System.out.println("4 - Hacia la derecha.");
        System.out.print("Opción:");
        String direccion = System.console().readLine();
        int way = Integer.parseInt(direccion);

        switch (way) {
            case 1:
                System.out.printf("           %1s\n", caracter);
                System.out.printf("        %1s  %1s  %1s\n", caracter, caracter, caracter);
                System.out.printf("     %1s  %1s  %1s  %1s  %1s\n", caracter, caracter, caracter, caracter , caracter);
                System.out.printf("  %1s  %1s  %1s  %1s  %1s  %1s  %1s\n", caracter,caracter, caracter, caracter, caracter , caracter, caracter);
                break;
            case 2:
                System.out.printf("  %1s  %1s  %1s  %1s  %1s  %1s  %1s\n", caracter,caracter, caracter, caracter, caracter , caracter, caracter);
                System.out.printf("     %1s  %1s  %1s  %1s  %1s\n", caracter, caracter, caracter, caracter , caracter);
                System.out.printf("        %1s  %1s  %1s\n", caracter, caracter, caracter);
                System.out.printf("           %1s\n", caracter);
                break;
            case 3: 
                System.out.printf("           %1s\n", caracter);
                System.out.printf("       %1s   %1s\n", caracter, caracter);
                System.out.printf("   %1s   %1s   %1s\n",caracter, caracter, caracter);
                System.out.printf("       %1s   %1s\n", caracter, caracter);
                System.out.printf("           %1s\n", caracter);
                break;
                case 4:
        
                System.out.printf("%1s\n", caracter);
                System.out.printf("%1s   %1s\n", caracter, caracter);
                System.out.printf("%1s   %1s   %1s\n",caracter, caracter, caracter);
                System.out.printf("%1s   %1s\n", caracter, caracter);
                System.out.printf("%1s\n", caracter);
                break;
                default:
        }
    }
}

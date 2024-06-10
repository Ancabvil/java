import java.io.Console;

public class Graphy {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available");
            return;
        }

        System.out.print("Introduzca un número: ");
        long numIntro = Long.parseLong(console.readLine());
        System.out.print("Simple o en Color (escriba S o C): ");
        String formato = console.readLine().toUpperCase();
        boolean formatoIntro = formato.equals("S") || formato.equals("C");
        long num = numIntro;
     //   int numDigitos = 0;
        long voltea = 0;

        // Definición de los colores ANSI
        String red = "\u001B[41m";    // Fondo rojo
        String green = "\u001B[42m";  // Fondo verde
        String blue = "\u001B[44m";   // Fondo azul
        String magenta = "\u001B[45m"; // Fondo magenta
        String reset = "\u001B[0m";   // Resetear color

        if (numIntro > 0) {
            if (formatoIntro) {
                // Voltea el número
                while (num > 0) {
                    voltea = (voltea * 10) + (num % 10);
                    num /= 10;
                   // numDigitos++;
                }

                // Determinar el dígito más alto
                long tempNum = numIntro;
                long numMax = 0;
                while (tempNum > 0) {
                    long digito = tempNum % 10;
                    if (digito > numMax) {
                        numMax = digito;
                    }
                    tempNum /= 10;
                }

                // Mostrar el número con las casillas y asteriscos o colores
                long cifra;
                while (voltea > 0) {
                    cifra = voltea % 10;
                    voltea /= 10;

                    // Imprimir la línea superior de las casillas
                    System.out.print("╔═══");
                    for (int i = 0; i < numMax; i++) {
                        System.out.print("╦═══");
                    }
                    System.out.print("╗\n");

                    // Imprimir la línea que contiene el número y las casillas
                    System.out.print("║ " + cifra + " ║");
                    for (int i = 0; i < numMax; i++) {
                        if (i < cifra) {
                            if (formato.equals("S")) {
                                System.out.print(" * ║");
                            } else {
                                if (i + 1 <= 4) {
                                    System.out.print(" " + red + " " + reset + " ║");
                                } else if (i + 1 <= 6) {
                                    System.out.print(" " + green + " " + reset + " ║");
                                } else if (i + 1 <= 8) {
                                    System.out.print(" " + blue + " " + reset + " ║");
                                } else {
                                    System.out.print(" " + magenta + " " + reset + " ║");
                                }
                            }
                        } else {
                            System.out.print("   ║");
                        }
                    }
                    System.out.print("\n");

                    // Imprimir la línea inferior de las casillas
                    System.out.print("╚═══");
                    for (int i = 0; i < numMax; i++) {
                        System.out.print("╩═══");
                    }
                    System.out.print("╝\n");
                }
            } else {
                System.out.println("Esa opción no está contemplada.");
            }
        } else {
            System.out.println("El número introducido debe ser mayor que 0.");
        }
    }
}

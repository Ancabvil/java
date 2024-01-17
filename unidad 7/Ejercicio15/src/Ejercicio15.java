public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        System.out.println("Restaurante \n");
        int mesa[] = new int[10];
        int ocupacion[] = new int[10];
        int ocupado=0;

        System.out.print("Mesa nº   ");
        for(int i = 0; i < 10; i++){
            System.out.print(" | " + i + " | ");
            mesa[i]=i;
        }
System.out.println();
System.out.print("Ocupación ");
        for(int i = 0; i <10; i++){
            ocupacion[i] =(int)(Math.random()*5);
            System.out.print(" | " + ocupacion[i] + " | ");
        }
        System.out.print("\n¿Cuantos son? (Introduzca -1 para salir del programa: ");
        int opción = Integer.parseInt(System.console().readLine());
        if (opción > 4) {
            System.out.println("Lo siento, no admitimos grupos de "+ opción + ", haga grupos de 4 personas como máximo e intente de nuevo");
        } else{
            int mesaVacia = 0;
            boolean hayMesaVacia = false;

            for (int i = 9; i <9; i++) {
                    if (mesa[i] == 0) {
                        mesaVacia = i;
                        hayMesaVacia = true;
                        }
                    }
                    
                    if (hayMesaVacia) {
                        mesa[mesaVacia]= ocupado;
                        System.out.println("Por favor, sientese en la mesa " + (mesaVacia + 1) + ".");
                        }else{
                            int iHueco = 0;
                            boolean hayHueco = false;
                            for( int j = 9; j >= 0; j--){
                                if (ocupado <= 4 - mesa[j]) {
                                    iHueco = j;
                                    hayHueco = true;

                                }
                            }
                            if (hayHueco) {
                                mesa[iHueco] += ocupado;
                                System.out.println("Tendrán que compartir mesa. Por favor siéntense en la mesa número " + (iHueco + 1) + ".");
                            }else{
                                System.out.println("Lo siento, en estos momentos no queda sitio.");
                            }
                        }
                    }while (ocupado !=1) {
                    
                    }
                }
            }



    


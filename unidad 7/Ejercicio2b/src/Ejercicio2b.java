public class Ejercicio2b {
    public static void main(String[] args) throws Exception {
        System.out.println("Sumas parciales en hoja de cálculo.");

int filas;
int columnas;

        int valores[][] = new int[5][6];
        System.out.println("Introduzca valores: ");
        for( filas = 0; filas < 5; filas++){
            for( columnas = 0; columnas < 6; columnas++){
                System.out.print("Fila " + filas + ", columna " + columnas + ": ");
                int intro = Integer.parseInt(System.console().readLine());
                valores[filas][columnas] = intro;
        }
    }
    //datos y sumas parciales de las filas
    int sumafilas;
    for( filas = 0; filas < 5; filas++){
            sumafilas = 0;
        for( columnas = 0; columnas < 6; columnas++){
            System.out.println(valores[filas][columnas]);
            sumafilas += valores[filas][columnas];
    }
    System.out.println(sumafilas);
}
//sumas parciales de las columnas
for(columnas = 0; columnas <5; columnas++){
    System.out.print("---------");
}
System.out.println("---------");


int sumacolumnas;
int sumatota = 0;
for(columnas = 0; columnas <5; columnas++){
    sumacolumnas=0;
    for(filas = 0; filas < 4; filas++){
        sumacolumnas+= valores[filas][columnas];
    }
    sumatota +=sumacolumnas;
    System.out.println(sumacolumnas);
}
System.out.println(sumatota);
    }
}
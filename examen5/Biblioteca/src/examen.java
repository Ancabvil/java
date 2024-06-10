import unidad8.arrays2d.elementos;
import unidad8.arrays1d.filtros;

public class examen {
    public static void main(String[] args) throws Exception {
        
    int numero = 74506;
    int cifra = 5;

    System.out.println("El número " + numero + " contiene la cifra " + cifra + "? ");

    int[] array = {12, 5, 39, 18, 209};
    int cifraFiltro = 9;
    int[] filtrados = filtros.FiltraConCifra(array, cifraFiltro);
    System.out.print("Numeros que contienen la cifra " + cifraFiltro + ": ");

    for (int num : filtrados) {
        System.out.print(num + " ");
    }
    System.out.println();

    int[][]array2D = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int aleatorio = elementos.aleatorioDeArray2d(array2D);
    System.out.println("Número aleatorio de array2D: " + aleatorio);

}
}

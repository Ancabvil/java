public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Gato garfield = new Gato();
        System.out.print("Mi gato Garfield tiene ");
        garfield.gato(5,12);

        Gato tom = new Gato();
        System.out.print("Mi gato Tom ");
        tom.gato(3, 10);
        Perro rocky = new Perro();
        System.out.print("Mi perro Rocky ");
        rocky.perro(10, "marron");

        Perro bobby = new Perro();
        System.out.print("Mi perro Bobby ");
        bobby.perro(15, "negro");

        Canario piolin = new Canario();
        System.out.print("Mi canario Piolin ");
        piolin.canario(1, "amarillo");

        Canario jimmy = new Canario();
        System.out.print("Mi canario Jimmy ");
        jimmy.canario(2, "naranja");
    }

}

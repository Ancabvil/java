public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Gato garfield = new Gato();
        System.out.print("Mi gato Garfield");
        garfield.gato(5,12);
        garfield.caca();
        Gato tom = new Gato();
        System.out.print("Mi gato Tom");
        tom.gato(3, 10);
        tom.caca();
        Perro rocky = new Perro();
        System.out.print("Mi perro Rocky");
        rocky.perro(12, "blanco");
        rocky.caca();
        rocky.crias();
        rocky.respiran();
        Perro bobby = new Perro();
        System.out.print("Mi perro Bobby");
        bobby.perro(15, "negro");
        bobby.caca();
        bobby.crias();
        bobby.respiran();

        Canario piolin = new Canario();
        System.out.print("Mi canario Piolin");
        piolin.canario(1, "amarillo");
        piolin.caca();
        piolin.crias();
        piolin.respiran();

        Canario jimmy = new Canario();
        System.out.print("Mi canario Jimmy");
        jimmy.canario(2, "naranja");
        jimmy.caca();
        jimmy.crias();
        jimmy.respiran();

        Lagarto juancho = new Lagarto();
        System.out.print("Mi lagarto Juancho");
        juancho.lagarto(2, 3);
        juancho.huevos();
        juancho.sangre();
    
    
    }

}

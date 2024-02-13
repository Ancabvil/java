public class Gato {
    
    private String nombre;
    private int edad;
    private String color;


    private void gato(){

    }

    private void gato(String nombre, int edad, String color){
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
    }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getColor() {
            return color;
        }  

        public void setColor(String color) {
            this.color = color;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        
}

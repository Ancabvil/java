public class Gato extends animal implements felinos {
    
    private String nombre;
    private int edad;
    private String color;
   
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void come(String comida) {
        
    }
    @Override
    public String getCodigo() {
       
        return null;
    }
    @Override
    public void hazRuido() {
       
        
    }
    @Override
    public void peleaCon(animal contrincante) {
       
        
    }
    
    

    


}

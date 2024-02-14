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
    public void peleaCon(animal contrincante) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void come(String comida) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void hazRuido() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public String getCodigo() {
        // TODO Auto-generated method stub
        return null;
    }
        


}

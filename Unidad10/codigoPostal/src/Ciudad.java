public class Ciudad {
    private String nombre;
    
    public Ciudad(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ciudad)) {
            return false;
        }
        Ciudad otraCiudad = (Ciudad) obj;
        return this.nombre.equals(otraCiudad.getNombre());
    }
    
    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
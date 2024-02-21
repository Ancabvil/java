import java.util.ArrayList;
public class Modulo {
    private String nombre;
    private int identificador;
    private ArrayList modulos;

    public Modulo(String nombre, int indentificador) {
        this.nombre = nombre;
        this.identificador = indentificador;
    }
    public ArrayList getModulos() {
        modulos.get(identificador);
        return modulos;
    }
    public void setModulos(ArrayList modulos) {
        modulos.set(identificador, modulos);
        this.modulos = modulos;
    }
    public int getIndentificador() {
        return identificador;
    }
    public void setIndentificador(int indentificador) {
        this.identificador = indentificador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "" + nombre + ", identificador=" + identificador;
    }
    
}

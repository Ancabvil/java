import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int identificador;
    private ArrayList estudiantes;

    ArrayList<Estudiante> estudiante = new ArrayList<>();

    public Estudiante(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList getEstudiantes() {
        estudiante.add(null);
        return estudiantes;
    }
    public void setEstudiantes(ArrayList estudiantes) {
        this.estudiantes = estudiantes;
    }
    @Override
    public String toString() {
        return "Nombre del estudiante=" + nombre + ", identificador=" + identificador;
    }

    
}

import java.util.ArrayList;
public class Departamento {
    private String nombre;
    private ArrayList profesores;
    private String jefeDepartamento;

    ArrayList<Profesor> profesor = new ArrayList<>();
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList getProfesores() {
        System.out.println("Introduzca el id:");
        int op = Integer.parseInt(System.console().readLine());
        profesor.get(op);
        return profesores;
    }
    public void setProfesores(ArrayList profesores) {
        profesores.add(profesores);
    }
    public String getJefeDepartamento() {
        return jefeDepartamento;
    }
    public void setJefeDepartamento(String jefeDepartamento) {
        this.jefeDepartamento = jefeDepartamento;
    }
    public Departamento(String nombre, ArrayList profesores, String jefeDepartamento) {
        this.nombre = nombre;
        this.profesores = profesores;
        this.jefeDepartamento = jefeDepartamento;
    }

    public String toString() {
        return  nombre + ", Nombre del jefe de departamento =" + jefeDepartamento;
    }


}

public class Profesor {
    private String nombre;
    private String especialidad;
    private String nombreDepartamento;
    private String jefe;

    
    public Profesor(String nombre, String especialidad, String nombreDepartamento, String jefe) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.nombreDepartamento = nombreDepartamento;
        this.jefe = jefe;
    }
    public String getnombreDepartamento() {
        return nombreDepartamento;
    }
    public void setDepartamento(String departamento) {
        this.nombreDepartamento = departamento;
    }

    public String getJefe() {
        return jefe;
    }
    public void setJefe(String jefe) {
        this.jefe = jefe;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

import java.util.ArrayList;
public class Cipfp {
    
private String nombre;
private String direccion;
private long telefono;

private ArrayList Estudiante;
private ArrayList Departamento;

ArrayList <Estudiante> estudiante = new ArrayList<>();
ArrayList <Departamento> departamento = new ArrayList<>();


public Cipfp(String nombre, String direccion, long telefono, java.util.ArrayList departamentos, java.util.ArrayList estudiante) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.Departamento = departamentos;
    this.Estudiante = estudiante;
}
public String getDireccion() {
    return direccion;
}
public void setDireccion(String direccion) {
    this.direccion = direccion;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public long getTelefono() {
    return telefono;
}
public void setTelefono(long telefono) {
    this.telefono = telefono;
}

public ArrayList getDepartamentos(ArrayList departamento) {

    return departamento;
}


public void AñadirEstudiante(ArrayList estudiante){
estudiante.add(estudiante);

}

public void EliminarEstudiante(ArrayList estudiante){
estudiante.remove(estudiante);

}

public void AñadirDepartamento(ArrayList departamento){
departamento.add(departamento);

}

public void EliminarDepartamento(ArrayList departamento){
departamento.remove(departamento);

}

@Override
public String toString() {
    return nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", Departamentos="
            + Departamento + ", estudiantes= " +Estudiante;
}

}

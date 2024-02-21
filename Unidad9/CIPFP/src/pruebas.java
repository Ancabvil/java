import java.util.ArrayList;

public class pruebas {
    public static void main(String[] args) throws Exception {



ArrayList <Departamento> departamento = new ArrayList<>();

Departamento departamento1 = new Departamento("Informática", departamento, "José Luis");
Departamento departamento2 = new Departamento("Relaciones Internacionales", departamento, "Joshep");
Departamento departamento3 = new Departamento("Microservicios", departamento, "Antonio");

departamento.add(departamento3);
departamento.add(departamento2);
departamento.add(departamento1);

for (Departamento departamentos : departamento) {
    System.out.println(departamentos.toString());
}


ArrayList <Estudiante> estudiante = new ArrayList<Estudiante>();
Estudiante estudiante1 = new Estudiante("Antonio Cabrera",12255);
Estudiante estudiante2 = new Estudiante("José Perez",12655);
Estudiante estudiante3 = new Estudiante("Xin Lus",17255);
Estudiante estudiante4 = new Estudiante("Chin gas",02255);

estudiante.add(estudiante1);
estudiante.add(estudiante2);
estudiante.add(estudiante3);
estudiante.add(estudiante4);
System.out.println();

for (Estudiante estudiantes : estudiante){
System.out.println(estudiantes.toString());
}

Modulo modulo1 = new Modulo("Programación", 1);
Modulo modulo2 = new Modulo("Sistemas Informáticos", 2);
Modulo modulo3 = new Modulo("Bases de datos", 3);
Modulo modulo4 = new Modulo("Lenguaje de marcas", 4);

ArrayList<Modulo> modulo = new ArrayList<Modulo>();
modulo.add(modulo1);
modulo.add(modulo2);
modulo.add(modulo3);
modulo.add(modulo4);
System.out.println();

for (Modulo modulos : modulo) {
    System.out.println(modulos.toString());


}
Cipfp allanTuring = new Cipfp("Allan Turing", "Calle talycual", 680352545, departamento, estudiante); 
System.out.println(allanTuring.toString());
}
}

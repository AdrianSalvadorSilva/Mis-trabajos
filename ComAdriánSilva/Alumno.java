package ComAdriánSilva;

import java.util.Arrays;

/*comentaria 1: las class Alumno hereda de la class Persona*/
public class Alumno extends Persona{
String institucion;
Asignatura[] materias;
//Constructor
public Alumno() {
	super();
}

public Alumno(int CI, String n, String a, String ins, int numeroMaterias) {
	super(CI, n, a);
	this.institucion=ins;
	this.materias = new Asignatura[numeroMaterias];
}

// Método para agregar una asignatura al vector
public void agregarAsignatura(int indice, Asignatura asignatura) {
    if (indice >= 0 && indice < materias.length) {
        materias[indice] = asignatura;
    } else {
        System.out.println("Índice fuera de rango");
    }
}

// Método para listar las asignaturas
public void listarAsignaturas() {
    for (Asignatura asignatura : materias) {
        if (asignatura != null) {
            System.out.println("Nombre: " + asignatura.getNombre() + ", Código: " + asignatura.getCodigo());
        }
    }
}

@Override
public String toString() {
	return "Alumno [institucion=" + institucion + ", materias=" + Arrays.toString(materias) + "]";
}
}


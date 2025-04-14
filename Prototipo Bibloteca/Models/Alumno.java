package Models;

public class Alumno extends Persona {
 private int matricula;

public Alumno(int cedula, int nombreApellido, String correo, String telefono) {
	super(cedula, nombreApellido, correo, telefono);
	
}

public Alumno(int cedula, int nombreApellido, String correo, String telefono, int matricula) {
	super(cedula, nombreApellido, correo, telefono);
	this.matricula = matricula;
}

public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}

}


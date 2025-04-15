package biblioteca;
public class Alumno extends Persona {
private String matricula;

public Alumno(int cI, String nombreApellido, String correo, String telefono, String matricula) {
	super(cI, nombreApellido, correo, telefono);
	this.matricula = matricula;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}
@Override
public String toString() {
	return "Alumno [matricula=" + matricula + "]";
}
}

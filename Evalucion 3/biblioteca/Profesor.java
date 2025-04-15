package biblioteca;

public class Profesor extends Persona {
private String especialidad;

public Profesor(int cI, String nombreApellido, String correo, String telefono, String especialidad) {
	super(cI, nombreApellido, correo, telefono);
	this.especialidad =  especialidad;
}

public String getEspecialidad() {
	return especialidad;
}

public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}
@Override
public String toString() {
	return "Profesor [especialidad=" + especialidad + "]";
}
}

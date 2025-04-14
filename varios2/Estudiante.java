package varios2;
//ejecicio8 segundo prate
public class Estudiante extends Persona1{
String carrera;

public Estudiante(String nombre, int edad ,String c) {
	super(nombre, edad);
	this.carrera = c;
}
public static void main(String[] args) {
	Estudiante esta = new Estudiante("Andrés ",20," ingeniería");
	esta.presentarse();
}
}

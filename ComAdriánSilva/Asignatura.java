package ComAdriánSilva;

public class Asignatura {
 String codigo;
 String nombre;
 public Asignatura(){}
public Asignatura(String codigo, String nombre) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Asignatura [codigo=" + codigo + ", nombre=" + nombre + "]";
}

}

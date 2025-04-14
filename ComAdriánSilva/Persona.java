package ComAdriánSilva;
public class Persona {
//comentario 1:
private int CI;
private String nombre;
private String apellido;
private String n;
private String a;
public Persona(int CI, String n, String a) {
	super();
	this.CI = CI;
	this.nombre = n;
	this.apellido = a;
}
public Persona(){}
public Persona(int c) {
	setCI(c);
	setNombre(n);
	setApellido(a);
}


public void setCedula(int c) {
	if(c > 500000){
	  }else if(c == 0){
		  
	  }
	}
//comeNTARIA 4:
public void setNombre(String n){
	if(n.equals(""))/*cometario 6:*/{
		System.out.println("Nombre no Valido, se asignó Desconocido");
		nombre = new String("Desconocido");
	}else if(n.equals(n)) {}	
}
public void setApellido(String a) {
	if(a.equals("")) {
		System.out.println("Apellido no Valido, se asignó Desconocido");
		nombre = new String("desconocido");
	}else if(a.equals(apellido)) {}
}


public int getCI() {
	return CI;
}
public void setCI(int cI) {
	CI = cI;
}
public String getNombre() {
	return nombre;
}
public String getApellido() {
	return apellido;
}
@Override
public String toString() {
	return "Persona [CI=" + CI + ", nombre=" + nombre + ", apellido=" + apellido + "]";
}
}

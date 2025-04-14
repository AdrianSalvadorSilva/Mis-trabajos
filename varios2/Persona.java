package varios2;
//ejeciocio6
public class Persona {
String nombre;
int edad;
public Persona(String nombre, int edad) {
	this.nombre = nombre;
	this.edad = edad;
}
public static void main(String[] args) {
	Persona p = new Persona("laura",28);
	System.out.println("Nombre: "+p.nombre+" , Edad;"+p.edad);
}
}

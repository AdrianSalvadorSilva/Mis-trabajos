package varios2;

public class Producto {
private String nombre;

public Producto(String nombre) {
	super();
	this.nombre = nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public static void main(String[] args) {
	Producto  prod = new Producto("Mouse");
	//prod.setNombre("Mouse");
 System.out.println("Producto: "+prod.getNombre());
 
 }
}

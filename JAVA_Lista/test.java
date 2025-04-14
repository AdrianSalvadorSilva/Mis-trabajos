package poo_java_adrian;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
	 List<Producto> productos = new ArrayList<>();
	 
	 //Agregar productos
	 productos.add(new Producto(1, "Laptop", 1200.99));
	 productos.add(new Producto(2, "Mouse", 25.50));
	 productos.add(new Producto(3, "Teclado", 45.00));
	 
	 //Mostrar productos
	 System.out.println("Lista de Productos :");
	 for(Producto p : productos) {
		 System.out.println(p);
	 }
	 
	 //BUscar productor por código
	 int codigoBuscado =2;
	for(Producto p : productos) {
		if(p.getCodigo() == codigoBuscado) {
		System.out.println("\n Producto encontrado: "+ p);
		break;
		}
	} 
     //Eliminar un producto
	productos.removeIf(p -> p.getCodigo()==1);
	 System.out.println("\n Lista después de eliminar porductor con código 1:");
	 for (Producto p : productos) {
		 System.out.println(p);
	 }
	}

}

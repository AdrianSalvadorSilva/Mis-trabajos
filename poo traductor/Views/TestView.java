package Views;

import Controllers.TraduccionController;
import models.Traduccion;

public class TestView {
public static void main(String[] args) {
	TraduccionController controlador = new TraduccionController();
	
	//Agregar traducciones
	controlador.agregarTraduccion(new Traduccion(1, "hola", "hello"));
	controlador.agregarTraduccion(new Traduccion(2, "adiós", "goodvye"));
	controlador.agregarTraduccion(new Traduccion(3, "gracia", "thank you"));
    controlador.agregarTraduccion(new Traduccion(4, "a",  "a"));
	
	System.out.println("Todas las traducciones: ");
	controlador.mostrarTodas();
	
	//Modificar una traducción
	controlador.modificarTraduccion(2, "adiós", "goodbye");
	
	//Consultar una traducción
	System.out.println("\nConsulta ID 2:");
	Traduccion t = controlador.consultarporId(2);
	if(t !=null) {
		System.out.println(t.toString());
	}
    //Eliminar una traducción
	controlador.eliminarTraduccion(1);
	
	System.out.println("\n Traducciones después de eliminar Id 1:");
	controlador.mostrarTodas();
}
}

package Controllers;

import java.util.ArrayList;

import models.Traduccion;

public class TraduccionController {
 private ArrayList< Traduccion>lista;
 
 public TraduccionController() {
	 lista = new ArrayList<>();
 }
 public void agregarTraduccion(Traduccion t) {
	 lista.add(t);
 }
 public boolean modificarTraduccion(int id, String nuevoEspanol, String nuevoIngles) {
for(Traduccion t : lista) {
	if (t.getId() == id ) {
		t.setEspanol(nuevoEspanol);
		t.setIngles(nuevoIngles);
		return true;
	}
  } 
return false;
 }
 
 
 public boolean eliminarTraduccion(int id) {
	 return lista.removeIf(t -> t.getId() ==id); 
 }
 public Traduccion consultarporId(int id ) {
	 for (Traduccion t: lista) {
		 if(t.getId() == id) {
			 return t;
		 }
	 }
	 return null;
 }
 public void mostrarTodas() {
	 for (Traduccion t : lista) {
		 System.out.println(t);
	 }
 }
}

package models;

public class Traduccion {
private int id;
private String espanol;
private String ingles;
public Traduccion(int id, String espanol, String ingles) {
	super();
	this.id = id;
	this.espanol = espanol;
	this.ingles = ingles;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEspanol() {
	return espanol;
}
public void setEspanol(String espanol) {
	this.espanol = espanol;
}
public String getIngles() {
	return ingles;
}
public void setIngles(String ingles) {
	this.ingles = ingles;
}

public String toString() {
	return id + " : " + espanol + " -> "+ ingles;
}
}

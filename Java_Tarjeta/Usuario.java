package vuenobus;

public class Usuario {
 private String nombre;
 private String telefono;
 private int CI;
 public Usuario() {}
 public Usuario(String n, String t, int ci) {
	this.nombre = n;
	this.telefono = t;
	this.CI =ci;
 }
	public void setNombre(String n) {
		 this.nombre = n;}
	public void setTelefono(String t) {
		this.telefono = t;}
	public void setCedula(int ci) {
		this.CI = ci;
	}
	public String getNombre() {return nombre;}
	public String getTelefono() {return telefono;}
	public int getCedula() {return CI;}
 
 }


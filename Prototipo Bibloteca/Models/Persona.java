package Models;

public class Persona abstract {
	private int cedula;
	private int nombreApellido;
	private String correo;
	private String telefono;
	public Persona(int cedula, int nombreApellido, String correo, String telefono) {
		super();
		this.cedula = cedula;
		this.nombreApellido = nombreApellido;
		this.correo = correo;
		this.telefono = telefono;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public int getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(int nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}


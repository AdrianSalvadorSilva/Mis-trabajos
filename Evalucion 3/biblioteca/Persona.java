package biblioteca;
public abstract class Persona {
	private int CI;
	private String nombreApellido;
	private String correo;
	private String telefono;
	public Persona(int cI, String nombreApellido, String correo, String telefono) {
		super();
		CI = cI;
		this.nombreApellido = nombreApellido;
		this.correo = correo;
		this.telefono = telefono;
	}
	public int getCI() {
		return CI;
	}
	public void setCI(int cI) {
		CI = cI;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
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
	@Override
	public String toString() {
		return "Persona [CI=" + CI + ", nombreApellido=" + nombreApellido + ", correo=" + correo + ", telefono="
				+ telefono + "]";
	}
}

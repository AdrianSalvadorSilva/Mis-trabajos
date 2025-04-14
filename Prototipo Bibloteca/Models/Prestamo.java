package Models;

public class Prestamo {
	private Materiales  materiales;
	private Prestamo persona;
	private String fechaSalida;
	private String fechaIngreso;
	public Persona(Materiales materiales, Prestamo persona, String fechaSalida, String fechaIngreso) {
		super()
		this.materiales = materiales;
		this.persona = persona;
		this.fechaSalida = fechaSalida;
		this.fechaIngreso = fechaIngreso;
	}
	public Materiales getMateriales() {
		return materiales;
	}
	public void setMateriales(Materiales materiales) {
		this.materiales = materiales;
	}
	public Prestamo getPersona() {
		return persona;
	}
	public void setPersona(Prestamo persona) {
		this.persona = persona;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
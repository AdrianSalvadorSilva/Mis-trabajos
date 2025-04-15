package biblioteca;
public class Prestamo {
	private Material material;
    private Persona prestatario ;
	private String fechSali;
	private String fechRegre;
	public Prestamo(Material material, Persona prestatario, String fechSali, String fechRegre) {
		super();
		this.material = material;
		this.prestatario = prestatario;
		this.fechSali = fechSali;
		this.fechRegre = fechRegre;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Persona getPrestatario() {
		return prestatario;
	}
	public void setPrestatario(Persona prestatario) {
		this.prestatario = prestatario;
	}
	public String getFechSali() {
		return fechSali;
	}
	public void setFechSali(String fechSali) {
		this.fechSali = fechSali;
	}
	public String getFechRegre() {
		return fechRegre;
	}
	public void setFechRegre(String fechRegre) {
		this.fechRegre = fechRegre;
	}
	@Override
	public String toString() {
		return "Prestamo [material=" + material + ", prestatario=" + prestatario + ", fechSali=" + fechSali
				+ ", fechRegre=" + fechRegre + "]";
	}
}

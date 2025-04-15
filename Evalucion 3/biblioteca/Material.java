package biblioteca;

public abstract class Material {
private int codigo;
private String autor;
private String titulo;
private int ayer;
private  String estado;
public Material(int codigo, String autor, String titulo, int ayer, String estado) {
	super();
	this.codigo = codigo;
	this.autor = autor;
	this.titulo = titulo;
	this.ayer = ayer;
	this.estado = estado;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getAyer() {
	return ayer;
}
public void setAyer(int ayer) {
	this.ayer = ayer;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
@Override
public String toString() {
	return "Material [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", ayer=" + ayer + ", estado="
			+ estado + "]";
}
}

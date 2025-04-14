package Models;

public class abstract Materiales {
 private int codigo;
 private String autor;
 private String titulo;
 private int years;//se refernte a año :D
 private String estado;
public Materiales(int codigo, String autor, String titulo, int years, String estado) {
	super();
	this.codigo = codigo;
	this.autor = autor;
	this.titulo = titulo;
	this.years = years;
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
public int getYears() {
	return years;
}
public void setYears(int years) {
	this.years = years;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
@Override
public String toString() {
	return "Materiales [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", years=" + years + ", estado="
			+ estado + "]";
}
 
}

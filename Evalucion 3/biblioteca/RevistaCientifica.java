package biblioteca;
public class RevistaCientifica extends Material {
private String areaCientifica;

public RevistaCientifica(int codigo, String autor, String titulo, int ayer, String estado, String areaCientifica) {
	super(codigo, autor, titulo, ayer, estado);
	this.areaCientifica = areaCientifica;
}

public String getAreaCientifica() {
	return areaCientifica;
}

public void setAreaCientifica(String areaCientifica) {
	this.areaCientifica = areaCientifica;
}

@Override
public String toString() {
	return "RevistaCientifica [areaCientifica=" + areaCientifica + "]";
}
}

package vuenobus;

public class Trasaccion {
//atributo
	String tipo;// viaje o recarga
	String fecha;
	Tarjeta Tarjeta;
	long monto;
	//contructor
	public Trasaccion(String t,String f, Tarjeta tj, long monto) {
		this.tipo = t;
		this.fecha = f;
		this.Tarjeta = tj;
		this.monto = monto;
	}
	public boolean procesar() {
		//vija hay  que restar, recarga hay que sumar
		if(tipo.equals("recarga")) {
			Tarjeta.cragarSaldo(monto);
		}else if(tipo.equals("viaje")){
			Tarjeta.descontarSaldo(monto);
		}
		return true;// si puedo cobrar es true sino se false
	}
}

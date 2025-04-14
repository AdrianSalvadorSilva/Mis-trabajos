package vuenobus;

public class TestVuenoBus {
public static void main(String[] args) {
	//tipo nombre = new contrutor
	//Usuario pasajero1 = new Usuario("Juan", "0981234567", 1234567);
   Usuario pasajero = new Usuario("Adrian", "059382", 163708);
    
   System.out.println("Nombre: " + pasajero.getNombre());
   System.out.println("Teléfono: " + pasajero.getTelefono());
   System.out.println("CI: " + pasajero.getCedula()); 
	//crear trajeta
	Tarjeta tarjeta001 = new Tarjeta("001", pasajero);
	//cragar saldo
	Trasaccion t1 = new Trasaccion("recarga","26/09/2025", tarjeta001,5000);
	if(t1.procesar()) {
		System.out.println("la transacion acentada");
	}else {System.out.println("la transacion NO SE PUDO REALISAR ");}
	System.out.println(""+tarjeta001.getSaldo());
	//2° transaccion
	Trasaccion t2 = new Trasaccion("viaje","26/09/2025", tarjeta001,1500);
	if(t2.procesar()) {
		System.out.println("se pago con exito");
	}else {System.out.println(" NO SE PUDO REALISAR EL PAGO " + tarjeta001.getSaldo());}
	System.out.println(""+tarjeta001.getSaldo());
}
}
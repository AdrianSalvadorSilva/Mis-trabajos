package vuenobus;

public class Tarjeta {
 String IDtrajeta;
 Usuario usuario;
 long saldo;
 //contrutor
 public Tarjeta(String ID, Usuario u) {
	 this.IDtrajeta =ID;
	 this.usuario= u;
	 this.saldo =0;
 }
 //metodo
 public void cragarSaldo(long monto) {
	 saldo = saldo + monto;
 }
 public void descontarSaldo(long monto) {
	 saldo = saldo - monto;
 }
 public long getSaldo() {
	 return saldo;
 }
}

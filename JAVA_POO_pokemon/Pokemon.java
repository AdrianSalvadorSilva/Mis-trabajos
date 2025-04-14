package poo_java_adrian;

public class Pokemon{
	 // atributo 
	    Tipo tipo;
		String nombre;
		int nivelVida; // 0 nokeado a 1000 sanisimo
		int velocidad; // 0 más lento a 100 más rapidos
		int poderDaño;
		int poderDefensa;
	
		//construtor
		public Pokemon(Tipo t, String n, int nv, int pda, int pde , int v ) {
			this.tipo = t;
			this.nombre= n;
			this.nivelVida = nv;
			this.poderDaño = pda;
			this.poderDefensa = pde;
			this.velocidad = v;
		
		}
	 public int atacar() {
		 int Valor =(int)(Math.random()*100 % 10)+1;
		 return Valor;
	 }
	 public boolean esquivar() {
		 int Valor =(int)(Math.random()*100 % 2);
		 if(Valor ==0) {
			 return true;
		 }else { return false;}
		 }
	 public Pokemon() {}
	 }
	 
	


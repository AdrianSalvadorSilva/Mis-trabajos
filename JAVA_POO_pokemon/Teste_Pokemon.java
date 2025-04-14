package poo_java_adrian;

public class Teste_Pokemon {
public static void main(String[] args) {
	Tipo telec = new Tipo("ELECTRICO");
	Tipo agua = new Tipo("AGUA");
	                       //(Tipo t, String n, int nv, int pda, int pde , int v ) 
	Pokemon pikachu = new Pokemon(telec, "PIKACHU", 95,70,60,100);
	Pokemon squiertle = new Pokemon(agua, "Squiertle", 95,80,50,95);
	//System.out.println(""+pikachu);
	Combate esmeralda = new Combate(pikachu, squiertle);
	esmeralda.iniciar();
}
}

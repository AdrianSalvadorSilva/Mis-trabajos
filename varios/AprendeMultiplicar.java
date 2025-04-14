package varios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AprendeMultiplicar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int aciertos=0 , errores=0;
 List<mensaje> mensajes= new ArrayList<>();
 
  System.out.println("!Bienvenido al juego de multiplicar¡");
  System.out.println("Debes resolver la multiplicacion. Ingres 0 para salir.");
  while(true) {
	 int numero1 = random.nextInt(9)+1;// Número entre 1 y 9
	 int numero2 = random.nextInt(9)+1;//Número entre 1 y 9
	 int resultCorrecto= numero1 * numero2;
	 System.out.println("¿Cuánto es "+ numero1 + " x "+ numero2 +"?");
	 int respuestaUsuario = sc.nextInt();
	 if(respuestaUsuario ==0) {
		 break;// salir del juego
	 }
	 if(respuestaUsuario == resultCorrecto) {
		 System.out.println("¡Correcto! Bien hecho");
		 aciertos++;
	 }else {
		 System.out.println("Incorrecto. la respueta se: "+resultCorrecto );
		 errores++;
	 }
  }
  public String(mensaje) {
	  
  }
 System.out.println("\n Juego terminado");	
 System.out.println("\n  Aciertos: "+ aciertos );		
 System.out.println("\n Errados: "+ errores);		
	}
 
}

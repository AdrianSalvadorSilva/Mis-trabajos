package varios;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random random = new Random();
int numeroSecreto = random.nextInt(10)+1;
int intento, intentosRealizados =0;
 System.out.println("¡Bienvenido al juego de adivinanza!");
 System.out.println("Estoy pensando en un número enter 1 y 100.");
 System.out.println("¿Puedes adivianr cuál es?");
 do {
 System.out.println("Introduce tu número: ");
 intento =sc.nextInt();
 intentosRealizados++;
 if(intento < numeroSecreto) {
	 System.out.println("Demasiado bajo. Inténtalo de nuevo.");
 }else if(intento > numeroSecreto){
	 System.out.println("Demasiado alto. Inténtalo de nuevo");
 }else {
	 System.out.println("¡Felicidades! Adivinaste el número en "
			 + intentosRealizados + "intentos." );
 }
 }while(intento !=  numeroSecreto);
 sc.close();
 }
}

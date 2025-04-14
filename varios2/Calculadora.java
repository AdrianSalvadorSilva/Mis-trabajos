package varios2;
// ejecicio10
public class Calculadora {
public int sumar(int a, int b) {
	return a+b;
}
//sobrecarga de métodos
public double sumar(double a, double b) {
	return a+b; }
public static void main(String[] args) {
	Calculadora calc = new Calculadora();
	System.out.println("Suma int. "+ calc.sumar(5, 3));
	System.out.println("Suma double. "+ calc.sumar(4.2, 2.8));

}
}

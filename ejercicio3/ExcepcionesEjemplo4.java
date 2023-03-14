package ejercicio3;

public class ExcepcionesEjemplo4 {
	public static void main(String[] args) {
	try {
		int resultado = dividir(10, 0);
	 	System.out.println("El resultado es: " + resultado);
	} catch (ArithmeticException e) {
		System.out.println("Error: división entre cero.");
	}
	}
	public static int dividir(int a, int b) throws ArithmeticException {
		if (b == 0) {
		throw new ArithmeticException();
	}
		return a / b;
	}
}
 
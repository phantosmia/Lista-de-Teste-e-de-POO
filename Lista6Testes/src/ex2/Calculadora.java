package ex2;

public class Calculadora {
	public double somar(double n1, double n2) {
		return n1 + n2;
	}

	public double subtrair(double n1, double n2) {
		return n1 - n2;
	}

	public double dividir(double n1, double n2) {
		if (n2 == 0) {
			System.out.println("Nao da para dividir por zero.");
			return 0;
		} else
			return n1 / n2;
	}

	public double multiplicar(double n1, double n2) {
		return n1 * n2;
	}
}

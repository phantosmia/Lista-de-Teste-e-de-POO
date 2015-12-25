package ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Calculadora c = new Calculadora();
		double n1, n2;
		String opcaoMenu;
		System.out.println("Digite o primeiro numero");
		n1 = leitor.nextDouble();
		System.out.println("Digite o segundo numero");
		n2 = leitor.nextDouble();
		System.out.println("1 - Soma");
		System.out.println("2 - Subtracao");
		System.out.println("3 - Multiplicacao");
		System.out.println("4 - Divisao");
		opcaoMenu = leitor.next();
		if(opcaoMenu.equals("1"))
			System.out.println(c.somar(n1, n2));
		else if(opcaoMenu.equals("2"))
			System.out.println(c.subtrair(n1, n2));
		else if(opcaoMenu.equals("3"))
			System.out.println(c.multiplicar(n1, n2));
		else
			System.out.println(c.dividir(n1, n2));
		
	}

}

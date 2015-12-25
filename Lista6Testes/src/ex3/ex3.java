package ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String palavra;
		Validacao v = new Validacao();
		System.out.println("Digite a palavra para ser o numero de tel");
		palavra = leitor.next();
		System.out.println(v.validarDigitos(palavra.toUpperCase()));
	}

}

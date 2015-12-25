package ex1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1 {
public static double calcularValor(double saldoConta, int meses){
	return saldoConta + ((saldoConta*0.06)*meses);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int meses;
	    DecimalFormat df = new DecimalFormat("#.##");
		double saldoConta;
		double valorTotal;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o saldo da conta:");
		saldoConta = leitor.nextDouble();
		System.out.println("Digite os meses que ficou guardado:");
		meses = leitor.nextInt();
		valorTotal =  calcularValor(saldoConta,meses);
		System.out.println("O valor total eh de:"+ df.format(valorTotal));
	}

}

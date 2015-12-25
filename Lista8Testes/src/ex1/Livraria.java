package ex1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Livraria {
	
	public static void main(String[] args) {
		// desconto mais vantajoso, seja ele por qtd total ou qtd de copia
		
		int livro [] = {0,0,0,0,0,0,0};
		double valorDescontoCopia [] = {0,0,0,0,0,0,0};
		int quantidade = 0;
		int quantidadeTotal = 0;
		int numLivros;
		double total;
		double precoTitulo = 42;
		double descontoQtd = 0, descontoCopia = 0;
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		while(opcao != 8){
			System.out.println("1 - Comprar copias do primeiro livro");
			System.out.println("2 - Comprar copias do segundo livro");
			System.out.println("3 - Comprar copias do terceiro livro");
			System.out.println("4 - Comprar copias do quarto livro");
			System.out.println("5 - Comprar copias do quinto livro");
			System.out.println("6 - Comprar copias do sexto livro");
			System.out.println("7 - Comprar copias do setimo livro");
			System.out.println("8 - Sair");
			opcao = leitor.nextInt();
			if(opcao != 8){
				System.out.println("Digite a quantidade");
				quantidade = leitor.nextInt();
				livro[opcao-1] = livro[opcao-1] + quantidade;
			}
		}
		//calculando valor do desconto pela quantidade de livros comprados
		for(int i = 0; i < 7; i++){
			quantidadeTotal = quantidadeTotal + livro[i];
		}
		total = quantidadeTotal * 42;
		if(quantidadeTotal == 1)
		{
			descontoQtd = total;
		}
		if(quantidadeTotal == 2)
		{
			descontoQtd = total * 0.95;
		}
		if(quantidadeTotal == 3)
		{
			descontoQtd = total * 0.90;
		}
		if(quantidadeTotal == 4)
		{
			descontoQtd = total * 0.85;
		}
		if(quantidadeTotal >= 5)
		{
			descontoQtd = total * 0.80;
		}
		System.out.println("Valor:"+descontoQtd);
		//calculando valor do desconto pela qtd de copias de cada livro
		for(int i = 0; i < 7; i++){
			if(livro[i] == 1){
				valorDescontoCopia[i] = livro[i] * precoTitulo;
			}
			if(livro[i] == 2){
				valorDescontoCopia[i] = ((livro[i] * precoTitulo) * 0.95);
			}
			if(livro[i] == 3){
				valorDescontoCopia[i] = ((livro[i] * precoTitulo) * 0.90);
			}
			if(livro[i] == 4){
				valorDescontoCopia[i] = ((livro[i] * precoTitulo) * 0.85);
			}
			if(livro[i] >= 5){
				valorDescontoCopia[i] = ((livro[i] * precoTitulo) * 0.80);
			}
			descontoCopia = descontoCopia + valorDescontoCopia[i];
		}
		System.out.println("Valor:"+descontoCopia);
		//compararemos o desconto que for mais vantajoso ao cliente
		if(descontoCopia < descontoQtd){
			System.out.println("Desconto mais vantajoso:"+descontoCopia);
		}
		else
			System.out.println("Desconto mais vantajoso:"+descontoQtd);
	}

}

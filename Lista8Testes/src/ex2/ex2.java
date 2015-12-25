package ex2;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		//int contSequenciaCol = 0;
	//	int contSequenciaRow = 0;
		int tamanho = 0;
		int sequenciaDiagonal = 1;
		int contDiagonal = 0;
		int sequenciaLinha = 1;
		int contLinha = 0;
		int sequenciaColuna = 1;
		int contColuna = 0;
		int maior = Integer.MIN_VALUE;
		Scanner leitor = new Scanner(System.in);
		while (tamanho < 5) {
			System.out.println("Insira o tamanho da matriz. Ela deve ser maior ou igual a 5");
			// primeiro: vc deve ver se a sequencia restante, caso os 5
			// primeiros numeros nao formem o maior, ainda tenha no minimo 5
			// numeros ou dara NUll pointer
			tamanho = leitor.nextInt();
		}
		int m[][] = new int[tamanho][tamanho];
		for (int i = 0; i < tamanho; i++) {
			for (int k = 0; k < tamanho; k++) {
				System.out.println("Informe o valor do numero. Linha:"+i+"Coluna:"+k);
				m[i][k] = leitor.nextInt();
			}
		}
		int numeroAtual = 0;
		int linhaAtual = 0;
		int colunaAtual = 0;
		for(int i = 0; i < tamanho; i++){
			for(int k = 0; k < tamanho; k++){
				sequenciaLinha = 1;
				sequenciaColuna = 1;
				sequenciaDiagonal = 1;
				numeroAtual = m[i][k];
				linhaAtual = i;
				colunaAtual = k;
				contDiagonal = 0;
				contLinha = 0;
				contColuna = 0;
				//neste for, vc vai verificar a sequencia restante
				for(int i2 = linhaAtual; i2 < tamanho; i2++){
					for(int k2 = colunaAtual; k2 < tamanho; k2++){
						if(i2 == k2){
							contDiagonal += 1;
						}
					}
				}
				for(int i2 = linhaAtual; i2 <= linhaAtual; i2++){
					for(int k2 = colunaAtual; k2 < tamanho; k2++)
					{
						contLinha += 1;
					}
				}
				for(int i2 = linhaAtual; i2 < tamanho; i2++)
				{
					for(int k2 = colunaAtual; k2 <= colunaAtual; k2++)
					{
						
					}
					contColuna += 1;
				}
				if(contDiagonal >= 5){
					for(int i3 = linhaAtual, contSequenciaRow = 0;  contSequenciaRow < 5; i3++,contSequenciaRow++){
						for(int k3 = colunaAtual, contSequenciaCol = 0; contSequenciaCol < 5; k3++,contSequenciaCol++){
							if(i3 == k3){
								sequenciaDiagonal *= m[i3][k3];
							}
						}
					}
				
					if(sequenciaDiagonal > maior){
						maior = sequenciaDiagonal;
					}
				}
				
				
				if(contLinha >= 5){
					for(int i3 = linhaAtual;  i3 <= linhaAtual; i3++){
							for(int k3 = colunaAtual, contSequenciaCol = 0; contSequenciaCol < 5; k3++,contSequenciaCol++){
							sequenciaLinha *= m[i3][k3];
						}
					}

					
					if(sequenciaLinha > maior){
						maior =  sequenciaLinha;
					}
				}
				
				
				if(contColuna >= 5){
					for(int i3 = linhaAtual, contSequenciaRow = 0;  contSequenciaRow < 5; i3++,contSequenciaRow++){
							for(int k3 = colunaAtual; k3 <= colunaAtual; k3++){
						    sequenciaColuna *= m[i3][k3];
						}
					}
					if(sequenciaColuna > maior){
						maior =  sequenciaColuna;
						
					}
				}
			}
		}
		if(maior != Integer.MIN_VALUE)
		System.out.println("A maior sequencia eh "+maior);
		else
			System.out.println("Algo deu errado.");
	}
}

package ex3;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lampadas = new LinkedList();
		int tamanho;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o numero de lampadas do corredor");
		tamanho = leitor.nextInt();
		for (int i = 0; i < tamanho; i++) {
			lampadas.add("off");
		}
		for (int i = 0; i < tamanho; i++) {
			for (int k = 0; k < tamanho; k++) {
				if (i == (tamanho - 1)) {
					if(k % tamanho == 0){
						if(lampadas.get(k) == "off")
							lampadas.set(k,"on");
						else if(lampadas.get(k) == "on")
							lampadas.set(k, "off");
					}

				} else {
					if(lampadas.get(k) == "off")
						lampadas.set(k,"on");
					else if(lampadas.get(k) == "on")
						lampadas.set(k, "off");
				}
			}
		}
		for(int i = 0; i < tamanho; i++)
			System.out.print(lampadas.get(i)+" ");
	}

}

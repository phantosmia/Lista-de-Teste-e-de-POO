package Atividade1;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 {
//um, dois, tres, quatro, cinco, seis, sete, oito, nove, dez, onze, doze, treze
	//cartoze, quinze, dezesseis, dezessete, dezoito, dezenove, vinte, trinta
	// quarenta, cinquenta, sessenta, setenta, oitenta, noventa, cem
	//duzentos, trezentos, quatrocentos, quinhentos, seiscentos, setecentos,
	//oitocentos, novecentos, mil
	//milhao, bilhao, trilhao
	//reais
	//centavos
	// 1 - um
	// 10 - dez
	// 100 - cem
	// 1 000 - mil
	// 10 000 - dez mil
	// 100 000 - cem mil
	// 1 000 000 - um milhao
	// 15 quinze
	// 150 - cento e cinquenta
	// 1 500 mil e quinhentos
	// 15 000 quinze mil
	// 1 500 000 - um milhao e quinhentos mil
	// 15 000 000 - quinze milhoes
	// tem mais que tres algarismos??? agrupe por grupo de tres.

		//Raquel Natali Mariz
	public String extrairReais(String valor){
		int indiceFinal = valor.length();
		boolean temVirgula = false;
		String caracter =  "";
		for(int i = 0; i < valor.length(); i++){
			caracter = Character.toString(valor.charAt(i));
			if(caracter.equals(",")){
				indiceFinal = i;
				break;
			}
		}
		return valor.substring(0,indiceFinal);
	}
	public String extrairCentavos(String valor){
		int indice = 0;
		boolean temVirgula = false;
		String caracter =  "";
		for(int i = 0; i < valor.length(); i++){
			caracter = Character.toString(valor.charAt(i));
			if(caracter.equals(",")){
				indice = i+1;
				temVirgula = true;
				
			}
		}
		if(temVirgula == false)
			return "0";
		else
			return valor.substring(indice, valor.length());
	}
	public boolean verificarValorValido(String valor){
		boolean invalido = false;
		int cont = 0;
		int contVirgula = 0;
		for(int i = 0; i < valor.length(); i++){
			String caracter = Character.toString(valor.charAt(i));
			if(caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3")|| caracter.equals("4")|| caracter.equals("5") || caracter.equals("6") || caracter.equals("7")|| caracter.equals("8")|| caracter.equals("9")|| caracter.equals(",")){
				if((caracter.equals(",") && (i == 0 || i == valor.length()-1)) || contVirgula > 1){
					System.out.println("Por favor, cheque se vc colocou a virgula no lugar correto ou se vc digitou mais que uma virgula.");
					invalido = true;
					contVirgula++;
				}
				
			}
			else{
				if(cont == 0){
				System.out.println("Vc digitou " + valor + " e isso nao eh considerado um valor valido");
				invalido = true;
				cont += 1;
				}
			}
		}//Raquel Natali Mariz
		if(invalido == true){
			return false;
		}
		else{
			return true;
		}
	}
	public String transformarExtenso(String reais, String centavos){
	    String valorFinal = "", auxiliar, valor2;
		String[] unidade = {"", "um", "dois", "três", "quatro", "cinco",
	             "seis", "sete", "oito", "nove", "dez", "onze",
	             "doze", "treze", "quatorze", "quinze", "dezesseis",
	             "dezessete", "dezoito", "dezenove"};
	    String[] centena = {"", "cento", "duzentos", "trezentos",
	             "quatrocentos", "quinhentos", "seiscentos",
	             "setecentos", "oitocentos", "novecentos"};
	    String[] dezena = {"", "", "vinte", "trinta", "quarenta", "cinquenta",
	             "sessenta", "setenta", "oitenta", "noventa"};
	    String[] singular = {"", "mil", "milhão", "bilhão", "trilhão"};
	    String[] plural = {"", "mil", "milhões", "bilhões", "trilhões"};

	    int n, unid, dez, cent, tam, i = 0;
	    boolean umReal = false, tem = false;
	    while (!reais.equals("0")) {
	      tam = reais.length();
	
	      if (tam > 3) {
	         valor2 = reais.substring(tam-3, tam);
	         reais = reais.substring(0, tam-3);
	      }
	      else { 
	        valor2 = reais;
	        reais = "0";
	      }
	      if (!valor2.equals("000")) {
	         auxiliar = "";
	         if (valor2.equals("100"))
	            auxiliar = "cem";
	         else {
	           n = Integer.parseInt(valor2, 10); 
	           cent = n / 100;                  
	           dez = (n % 100) / 10;            
	           unid = (n % 100) % 10;         
	           if (cent != 0)
	              auxiliar = centena[cent];
	           if ((n % 100) <= 19) {
	              if (auxiliar.length() != 0)
	                 auxiliar = auxiliar + " e " + unidade[n % 100];
	              else auxiliar = unidade[n % 100];
	           }
	           else {
	              if (auxiliar.length() != 0)
	                 auxiliar = auxiliar + " e " + dezena[dez];
	              else auxiliar = dezena[dez];
	              if (unid != 0) {
	                 if (auxiliar.length() != 0)
	                    auxiliar = auxiliar + " e " + unidade[unid];
	                 else auxiliar = unidade[unid];
	              }
	           }
	         }
	         if (valor2.equals("1") || valor2.equals("001")) {
	            if (i == 0) 
	               umReal = true;
	            else auxiliar = auxiliar + " " + singular[i];
	         }
	         else if (i != 0)
	                 auxiliar = auxiliar + " " + plural[i];
	         if (valorFinal.length() != 0)
	            valorFinal = auxiliar + ", " + valorFinal;
	         else valorFinal = auxiliar;
	      }
	      if (((i == 0) || (i == 1)) && valorFinal.length() != 0)
	         tem = true;
	      i = i + 1; 
	    }

	    if (valorFinal.length() != 0) {
	       if (umReal)
	          valorFinal = valorFinal + " real";
	       else if (tem)
	               valorFinal = valorFinal + " reais";
	            else valorFinal = valorFinal + " de reais";
	    }

	// definindo o extenso dos centavos do valor
	    if (!centavos.equals("0")) { // valor com centavos
	       if (valorFinal.length() != 0) // se não é valor somente com centavos
	          valorFinal = valorFinal + " e ";
	       if (centavos.equals("1"))
	          valorFinal = valorFinal + "um centavo";
	       else {
	         n = Integer.parseInt(centavos, 10);
	         if (n <= 19)
	            valorFinal = valorFinal + unidade[n];
	         else {             
	           unid = n % 10;   
	           dez = n / 10;    
	           valorFinal = valorFinal + dezena[dez];
	           if (unid != 0)
	              valorFinal = valorFinal + " e " + unidade[unid];
	         }
	         valorFinal = valorFinal + " centavos";
	       }
	    }
	    return(valorFinal);
	}
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		String valor = "";
		String centavos = "";
		String reais = "";
		Atividade1 a = new Atividade1();
		boolean valido = false;
		System.out.println("Favor digitar o valor monetario.");
		valor = leitor.next();
		valido = a.verificarValorValido(valor);
		while(valido != true){
			System.out.println("Digite um valor valido.");
			valor = leitor.next();
			valido = a.verificarValorValido(valor);
		}
		centavos = a.extrairCentavos(valor);
		reais = a.extrairReais(valor);
		System.out.println(a.transformarExtenso(reais,centavos));
		System.out.println("Fim - Raquel Natali Mariz.");
	}
}

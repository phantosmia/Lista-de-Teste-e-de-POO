package ex3;

public class Validacao {
public String validarDigitos(String palavra){
	String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String caracterPalavra;
	String caracterAlfabeto;
	String numero = "";
	if(palavra.length() >= 1 && palavra.length() <= 30){
	for(int i = 0; i < palavra.length(); i++){
		for(int j = 0; j < alfabeto.length(); j++){
			caracterPalavra = Character.toString(palavra.charAt(i));
			caracterAlfabeto = Character.toString(alfabeto.charAt(j));
			if(caracterPalavra.equals("1") || caracterPalavra.equals("-")){
				numero = numero.concat(caracterPalavra);
				break;
			}
			else{
				if(caracterPalavra.equals(caracterAlfabeto)){
				if((j+1) <= 3)
					numero = numero.concat("2");
				else if((j+1) > 3 && (j+1) <= 6)
				numero = numero.concat("3");
				else if((j+1) > 6 && (j+1) <= 9)
				numero = numero.concat("4");
				else if((j+1) > 9 && (j+1) <= 12)
				numero = numero.concat("5");
				else if((j+1) > 12 && (j+1) <= 15)
				numero = numero.concat("6");
				else if((j+1) > 15 && (j+1) <= 19)
					numero = numero.concat("7");
				else if((j+1) > 19 && (j+1) <= 22)
					numero = numero.concat("8");
				else if((j+1) > 22){
					numero = numero.concat("9");
				}
				}
		}
		}
	}
	}
	else{
		System.out.println("Sua palavra deve ter mais que um caracter e no maximo 30 caracteres.");
	}
	return numero;
}
}

import java.util.Scanner;

public class Teste {
public static void menu(){
	String opcaoMenu = "";
	Scanner leitor = new Scanner(System.in);
	Almoxarifado a = new Almoxarifado();
	while(!opcaoMenu.equals("6")){
		System.out.println("1 - Inserir produto");
		System.out.println("2 - Alterar produto");
		System.out.println("3 - Gerar Relatorio");
		System.out.println("4 - Carregar produtos salvos");
		System.out.println("5 - Salvar produtos");
		System.out.println("6 - Sair");
		opcaoMenu = leitor.next();
		if(opcaoMenu.equals("1")){
			a.cadastrarDados();
		}
		if(opcaoMenu.equals("2")){
			a.alterarDados();
		}
		if(opcaoMenu.equals("3")){
			a.gerarRelatorio();
		}
		if(opcaoMenu.equals("4")){
			a.lerArquivo();
		}
		if(opcaoMenu.equals("5")){
			a.salvarArquivo();
		}
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	menu();
	}

}

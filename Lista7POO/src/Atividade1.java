
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog(null, "Informe seu login");
		String senha = JOptionPane.showInputDialog(null, "Informe sua senha");
		while(!login.equals("raquel") || !senha.equals("tomate")){
			JOptionPane.showMessageDialog(null, "Conta invalida! digite novamente.");
			login = JOptionPane.showInputDialog(null, "Informe seu login");
			senha = JOptionPane.showInputDialog(null, "Informe sua senha");
		}
		String opcaoMenu = "";
		Relatorio r = new Relatorio();
		Scanner leitor = new Scanner(System.in);
		opcaoMenu = leitor.next();
		while(!opcaoMenu.equals("5")){
			System.out.println("1 - Adicionar fechamento");
			System.out.println("2 - Salvar fechamentos em um arquivo");
			System.out.println("3 - Mostrar fechamentos");
			System.out.println("4 - Carregar fechamentos ja salvos");
			System.out.println("5 - Sair");
			
			opcaoMenu = leitor.next();
			if(opcaoMenu.equals("1")){
				r.cadastrarDados();
			}
			if(opcaoMenu.equals("2")){
				r.salvarArquivo();
			}
			if(opcaoMenu.equals("3")){
				r.gerarRelatorio();
			}
			if(opcaoMenu.equals("4")){
				r.lerArquivo();
			}
			}
	}
	
	
}

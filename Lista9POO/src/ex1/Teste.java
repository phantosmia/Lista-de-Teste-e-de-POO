package ex1;

import javax.swing.JFrame;

public class Teste extends JFrame {
public void configurarTela(){
	pack();
	setSize(500,500);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //assim nao fecha as outras janelas filhas
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teste teste = new Teste();
		teste.configurarTela();
		Tela tela = new Tela();
		teste.add(tela);
	}

}

package ex2;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame implements ActionListener {
	private JButton j1, j2, j3, j4;
	private JTextField txt1, txt2;
	private JLabel txt3, txt4;
	private int contador = 0;
	//private JLabel lContador;
	public Janela(){
		super("Exercicio 2 POO");
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,1));
		
		txt1 = new JTextField();
		txt2 = new JTextField();
		txt3 = new JLabel();
		//txt4 = new JLabel("Obrigada");
		j1 = new JButton("Soma");
		j2 = new JButton("Subtrair");
		j3 = new JButton("Multiplicar");
		j4 = new JButton("Dividir");
		//lContador = new JLabel(""+contador);
		c.add(txt1);
		c.add(txt2);
		c.add(j1);c.add(j2);
		c.add(j3);
		c.add(j4);//c.add(lContador);
		c.add(txt3);
		//c.add(txt4);
		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
		j4.addActionListener(this);
		pack();
		setVisible(true);
		setDefaultCloseOperation(3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Janela j = new Janela();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == j1){
			double n1 = Double.parseDouble(txt1.getText());
			double n2 = Double.parseDouble(txt2.getText());
			txt3.setText(String.valueOf(n1+n2));
		}
		else if(arg0.getSource() == j2){
			double n1 = Double.parseDouble(txt1.getText());
			double n2 = Double.parseDouble(txt2.getText());
			txt3.setText(String.valueOf(n1-n2));
		}
		else if(arg0.getSource() == j3){
			double n1 = Double.parseDouble(txt1.getText());
			double n2 = Double.parseDouble(txt2.getText());
			txt3.setText(String.valueOf(n1*n2));
		}
		else if(arg0.getSource() == j4){
			double n1 = Double.parseDouble(txt1.getText());
			double n2 = Double.parseDouble(txt2.getText());
			if(n2 == 0){
				txt3.setText("invalido");
			}
			else
				txt3.setText(String.valueOf(n1/n2));
		}
	//	lContador.setText(""+contador);
	}

}

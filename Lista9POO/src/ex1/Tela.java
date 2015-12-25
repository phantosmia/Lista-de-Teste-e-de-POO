package ex1;

import java.awt.Graphics;

import javax.swing.JComponent;

public class Tela extends JComponent {
public void paintComponent(Graphics g){
	super.paintComponent(g);
	for(int i = 0; i< 15; i++)
	{
		g.drawRect(10+i*10,10+i*10,50+i*10, 50+i*10);
	}
}
}

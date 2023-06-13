package classes;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	public void paintComponet(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();//largura total
		int height = getHeight();//altura total
		
		//
		g.drawLine(0, 0, width, height);
		
		//
		g.drawLine(0, height, width, 0);
	}

}//FIM da classe DrawPanel

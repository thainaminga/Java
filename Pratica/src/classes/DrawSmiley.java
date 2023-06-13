package classes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawSmiley extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//desenhar o rosto
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		//desenhar os olhos
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65,30,30);
		
		//desenhar a boca
		g.fillOval(50, 110, 120, 60);
		
		//"retoca" a boca para criar um sorriso
		g.setColor(Color.YELLOW);
		g.fillOval(50, 120, 120, 30);
		g.fillOval(50, 120, 120, 40);
		
	}

}// FIM da classe DrawSmiley

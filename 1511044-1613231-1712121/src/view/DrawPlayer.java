package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class DrawPlayer extends JPanel{

	public void paintComponemt (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		Ellipse2D circ;
		
		circ = new Ellipse2D.Double(100,100,100,100);
		g2d.setColor(Color.BLACK);
		g2d.draw(circ);
	}
}

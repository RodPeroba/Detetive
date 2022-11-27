package view;

import java.awt.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class hand_panel extends JPanel {
	public hand_panel() {
		this.setPreferredSize(new Dimension(500,500));
		this.setLayout(null);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		
		Image hand_bg;
		try {
			hand_bg = ImageIO.read(getClass().getResourceAsStream("/Backgrounds/background.jpg"));
			g2D.drawImage(hand_bg, 0,0, 500, 500, null);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
}
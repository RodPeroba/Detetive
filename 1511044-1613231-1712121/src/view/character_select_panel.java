package view;

import java.awt.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class character_select_panel extends JPanel{
	public character_select_panel() {
		
		this.setPreferredSize(new Dimension(1200,700));
		this.setLayout(null);
		
		JCheckBox cb0 = new JCheckBox("Green");
		JCheckBox cb1 = new JCheckBox("Mustard");
		JCheckBox cb2 = new JCheckBox("Peacock");
		JCheckBox cb3 = new JCheckBox("Plum");
		JCheckBox cb4 = new JCheckBox("Scarlet");
		JCheckBox cb5 = new JCheckBox("White");
		
		JButton button_start_game = new JButton("Iniciar Partida");
		
		cb0.setOpaque(false);
		cb1.setOpaque(false);
		cb2.setOpaque(false);
		cb3.setOpaque(false);
		cb4.setOpaque(false);
		cb5.setOpaque(false);
		
		cb0.setForeground(Color.white);
		cb1.setForeground(Color.white);
		cb2.setForeground(Color.white);
		cb3.setForeground(Color.white);
		cb4.setForeground(Color.white);
		cb5.setForeground(Color.white);
		
		cb0.setBounds(900, 150, 120, 50);
		cb1.setBounds(900, 200, 120, 50);
		cb2.setBounds(900, 250, 120, 50);
		cb3.setBounds(900, 300, 120, 50);
		cb4.setBounds(900, 350, 120, 50);
		cb5.setBounds(900, 400, 120, 50);
		button_start_game.setBounds(500, 600, 200, 50);
		
		this.add(cb0);
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		this.add(cb4);
		this.add(cb5);
		this.add(button_start_game);
	}

	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		
		Image[] characters;
		Image bg;
		characters = new Image[6];
		
		try {
			bg = ImageIO.read(getClass().getResourceAsStream("/Backgrounds/background.jpg"));
			g2D.drawImage(bg, 0, 0, 1200, 700, null);
			
			characters[0] = ImageIO.read(getClass().getResourceAsStream("/Suspeitos/Green.jpg"));
			characters[1] = ImageIO.read(getClass().getResourceAsStream("/Suspeitos/Mustard.jpg"));
			characters[2] = ImageIO.read(getClass().getResourceAsStream("/Suspeitos/Peacock.jpg"));
			characters[3] = ImageIO.read(getClass().getResourceAsStream("/Suspeitos/Plum.jpg"));
			characters[4] = ImageIO.read(getClass().getResourceAsStream("/Suspeitos/Scarlet.jpg"));
			characters[5] = ImageIO.read(getClass().getResourceAsStream("/Suspeitos/White.jpg"));
			
			g2D.drawImage(characters[0], 170, 70, 145, 225, null);
			g2D.drawImage(characters[1], 410, 70, 145, 225, null);
			g2D.drawImage(characters[2], 650, 70, 145, 225, null);
			g2D.drawImage(characters[3], 170, 300, 145, 225, null);
			g2D.drawImage(characters[4], 410, 300, 145, 225, null);
			g2D.drawImage(characters[5], 650, 300, 145, 225, null);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
}

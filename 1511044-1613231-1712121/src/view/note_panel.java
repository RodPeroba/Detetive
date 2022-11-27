package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class note_panel extends JPanel{
	public note_panel() {
		
		this.setPreferredSize(new Dimension(500,500));
		this.setLayout(null);
		
		JCheckBox cb_sus0 = new JCheckBox("Green");
		JCheckBox cb_sus1 = new JCheckBox("Mustard");
		JCheckBox cb_sus2 = new JCheckBox("Peacock");
		JCheckBox cb_sus3 = new JCheckBox("Plum");
		JCheckBox cb_sus4 = new JCheckBox("Scarlet");
		JCheckBox cb_sus5 = new JCheckBox("White");
		
		JCheckBox cb_room0 = new JCheckBox("Biblioteca");
		JCheckBox cb_room1 = new JCheckBox("Cozinha");
		JCheckBox cb_room2 = new JCheckBox("Entrada");
		JCheckBox cb_room3 = new JCheckBox("Escritório");
		JCheckBox cb_room4 = new JCheckBox("Jardim de Inverno");
		JCheckBox cb_room5 = new JCheckBox("Sala de Estar");
		JCheckBox cb_room6 = new JCheckBox("Sala de Jantar");
		JCheckBox cb_room7 = new JCheckBox("Sala de Música");
		JCheckBox cb_room8 = new JCheckBox("Salão de Jogos");
		
		JCheckBox cb_armas0 = new JCheckBox("Cano");
		JCheckBox cb_armas1 = new JCheckBox("Castiçal");
		JCheckBox cb_armas2 = new JCheckBox("Chave Inglesa");
		JCheckBox cb_armas3 = new JCheckBox("Corda");
		JCheckBox cb_armas4 = new JCheckBox("Faca");
		JCheckBox cb_armas5 = new JCheckBox("Revólver");
		
		cb_sus0.setBounds(45, 100, 120, 25);
		cb_sus1.setBounds(45, 135, 120, 25);
		cb_sus2.setBounds(45, 170, 120, 25);
		cb_sus3.setBounds(45, 205, 120, 25);
		cb_sus4.setBounds(45, 240, 120, 25);
		cb_sus5.setBounds(45, 275, 120, 25);
		
		cb_room0.setBounds(190, 100, 120, 25);
		cb_room1.setBounds(190, 135, 120, 25);
		cb_room2.setBounds(190, 170, 120, 25);
		cb_room3.setBounds(190, 205, 120, 25);
		cb_room4.setBounds(190, 240, 130, 25);
		cb_room5.setBounds(190, 275, 120, 25);
		cb_room6.setBounds(190, 310, 120, 25);
		cb_room7.setBounds(190, 345, 120, 25);
		cb_room8.setBounds(190, 380, 120, 25);
										   
		cb_armas0.setBounds(375, 100, 120, 25);
		cb_armas1.setBounds(375, 135, 120, 25);
		cb_armas2.setBounds(375, 170, 120, 25);
		cb_armas3.setBounds(375, 205, 120, 25);
		cb_armas4.setBounds(375, 240, 120, 25);
		cb_armas5.setBounds(375, 275, 120, 25);

		cb_sus0.setOpaque(false);
		cb_sus1.setOpaque(false);
		cb_sus2.setOpaque(false);
		cb_sus3.setOpaque(false);
		cb_sus4.setOpaque(false);
		cb_sus5.setOpaque(false);
		
		cb_room0.setOpaque(false);
		cb_room1.setOpaque(false);
		cb_room2.setOpaque(false);
		cb_room3.setOpaque(false);
		cb_room4.setOpaque(false);
		cb_room5.setOpaque(false);
		cb_room6.setOpaque(false);
		cb_room7.setOpaque(false);
		cb_room8.setOpaque(false); 
		
		cb_armas0.setOpaque(false);
		cb_armas1.setOpaque(false);
		cb_armas2.setOpaque(false);
		cb_armas3.setOpaque(false);
		cb_armas4.setOpaque(false);
		cb_armas5.setOpaque(false);
		
		this.add(cb_sus0);
		this.add(cb_sus1);
		this.add(cb_sus2);
		this.add(cb_sus3);
		this.add(cb_sus4);
		this.add(cb_sus5);
		
		this.add(cb_room0);
		this.add(cb_room1);
		this.add(cb_room2);
		this.add(cb_room3);
		this.add(cb_room4);
		this.add(cb_room5);
		this.add(cb_room6);
		this.add(cb_room7);
		this.add(cb_room8);		
		
		this.add(cb_armas0);
		this.add(cb_armas1);
		this.add(cb_armas2);
		this.add(cb_armas3);
		this.add(cb_armas4);
		this.add(cb_armas5);
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
			
		Image notebook_bg;
		try {
			notebook_bg = ImageIO.read(getClass().getResourceAsStream("/Backgrounds/notebook_texture.jpg"));
			g2D.drawImage(notebook_bg, 0,0, 500, 500, null);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		g2D.setPaint(Color.black);
		g2D.drawString("Suspeitos", 55, 70);
		g2D.drawRect(20, 75, 125, 250);
		g2D.drawString("Cômodos", 223, 70);
		g2D.drawRect(165, 75, 170, 355);
		g2D.drawString("Armas", 400, 70);
		g2D.drawRect(355, 75, 125, 250);
	}

}

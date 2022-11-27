package view;

import java.awt.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class menu_panel extends JPanel{
	public menu_panel() {
		
		this.setPreferredSize(new Dimension(1200,700));
		this.setLayout(null);
		
		JButton button_new_game = new JButton("Novo Jogo");
		JButton button_load_saved_game = new JButton("Carregar Jogo");
		
		button_new_game.setBounds(540, 550, 120, 30);
		button_load_saved_game.setBounds(540, 605, 120, 30);
		
		this.add(button_new_game);
		this.add(button_load_saved_game);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		
		Image background_image;
		try {
			background_image = ImageIO.read(getClass().getResourceAsStream("/Backgrounds/Tela_inicial1.jpg"));
			g2D.drawImage(background_image, 0,0, 1200, 700, null);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
}
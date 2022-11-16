package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Detetive_panel extends JPanel { // MyDrawImagePanel
	
	static int flag_drawimg = -1;
	
	public Detetive_panel() {}
	
	public static JPanel main_menu_panel() {
		flag_drawimg = 0;
		
		JPanel p = new Detetive_panel(); 
		p.setPreferredSize(new Dimension(1200,700));
		p.setLayout(null);
		
		JButton button_new_game = new JButton("Novo Jogo");
		JButton button_load_saved_game = new JButton("Carregar Jogo");
		
		button_new_game.setBounds(540, 550, 120, 30);
		button_load_saved_game.setBounds(540, 605, 120, 30);
		
		p.add(button_new_game);
		p.add(button_load_saved_game);
		
		return p;
	}
	
	public static JPanel character_panel() {
		flag_drawimg = 1;
		
		JPanel p = new Detetive_panel();
		p.setPreferredSize(new Dimension(1200,700));
		p.setLayout(null);
		
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
		
		p.add(cb0);
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		p.add(cb5);
		p.add(button_start_game);
		
		return p;
	}
	
	public static JPanel board_panel() {
		flag_drawimg = 2;
		
		JPanel p = new Detetive_panel(); 
		p.setPreferredSize(new Dimension(1200,700));
		p.setLayout(null);
		
		JButton button_chose_die_value = new JButton("Escolher Valor dos dados");
		JButton button_throw_die = new JButton("Jogar dados");
		JButton button_secret_passage = new JButton("Usar passagem secreta");
		JButton button_show_hand = new JButton("Mostrar cartas da mão");
		JButton button_show_notebook = new JButton("Mostrar suas anotações");
		JButton button_next_player = new JButton("Passar a vez");
		JButton button_guess = new JButton("Fazer palpite");
		JButton button_accuse = new JButton("Fazer acusação");
		JButton button_save_game = new JButton("Salvar jogo");
		
		button_chose_die_value.setBounds(750, 25, 400, 50);
		button_throw_die.setBounds		(750, 250, 400, 50);
		button_secret_passage.setBounds	(750, 325, 400, 50);
		button_show_hand.setBounds		(750, 400, 187, 50);
		button_show_notebook.setBounds	(963, 400, 187, 50);
		button_next_player.setBounds	(750, 475, 400, 50);
		button_guess.setBounds			(750, 550, 187, 50);
		button_accuse.setBounds			(963, 550, 187, 50);
		button_save_game.setBounds		(750, 625, 400, 50);
		
		p.add(button_chose_die_value);
		p.add(button_throw_die);
		p.add(button_secret_passage);
		p.add(button_show_hand);
		p.add(button_show_notebook);
		p.add(button_next_player);
		p.add(button_guess);
		p.add(button_accuse);
		p.add(button_save_game);
		
		return p;
	}
	
	public static JPanel hand_panel() {
		flag_drawimg = 3;
		
		
		JPanel p = new Detetive_panel(); 
		p.setPreferredSize(new Dimension(500,500));
		p.setLayout(null);
		
		return p;
	}
	
	public static JPanel notebook_panel() {
		flag_drawimg = 4;
		
		JPanel p = new Detetive_panel();
		p.setPreferredSize(new Dimension(500,500));
		p.setLayout(null);
		
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
		
		p.add(cb_sus0);
		p.add(cb_sus1);
		p.add(cb_sus2);
		p.add(cb_sus3);
		p.add(cb_sus4);
		p.add(cb_sus5);
		
		p.add(cb_room0);
		p.add(cb_room1);
		p.add(cb_room2);
		p.add(cb_room3);
		p.add(cb_room4);
		p.add(cb_room5);
		p.add(cb_room6);
		p.add(cb_room7);
		p.add(cb_room8);		
		
		p.add(cb_armas0);
		p.add(cb_armas1);
		p.add(cb_armas2);
		p.add(cb_armas3);
		p.add(cb_armas4);
		p.add(cb_armas5);
		
		return p;
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;

		
		switch(flag_drawimg) {
		
		case 0: // menu inicial
			Image background_image;
			try {
				background_image = ImageIO.read(getClass().getResourceAsStream("/Backgrounds/Tela_inicial1.jpg"));
				g2D.drawImage(background_image, 0,0, 1200, 700, null);
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
				System.exit(1);
			}
			break;
			
		case 1: // character selection
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
			
			break;
			
		case 2: // board
			Image board, board_bg, button_bg;
			Image[] dice_sides = new Image[6];
			
			// PLACEHOLDER color_array based on player index
			Color[] color_array = new Color[6];
			color_array[0] = Color.green;
			color_array[1] = Color.yellow;
			color_array[2] = Color.blue;
			color_array[3] = Color.magenta;
			color_array[4] = Color.red;
			color_array[5] = Color.white;
			
			
			
			try {
				board = ImageIO.read(getClass().getResourceAsStream("/Tabuleiros/Tabuleiro-Clue-A.jpg"));
				g2D.drawImage(board, 0,0, 700, 700, null);
				
				board_bg = ImageIO.read(getClass().getResourceAsStream("/Backgrounds/background.jpg"));
				g2D.drawImage(board_bg, 700,0, 500, 700, null);
				
				g2D.setPaint(Color.black);
				g2D.setStroke(new BasicStroke(8));
				g2D.drawRect(900, 100, 100, 125);
				g2D.drawRect(750, 100, 125, 125);
				g2D.drawRect(1025, 100, 125, 125);
				
				// optmization: only read thrown dies
				dice_sides[0] = ImageIO.read(getClass().getResourceAsStream("/Tabuleiros/dado1.jpg"));
				dice_sides[1] = ImageIO.read(getClass().getResourceAsStream("/Tabuleiros/dado2.jpg"));
				dice_sides[2] = ImageIO.read(getClass().getResourceAsStream("/Tabuleiros/dado3.jpg"));
				dice_sides[3] = ImageIO.read(getClass().getResourceAsStream("/Tabuleiros/dado4.jpg"));
				dice_sides[4] = ImageIO.read(getClass().getResourceAsStream("/Tabuleiros/dado5.jpg"));
				dice_sides[5] = ImageIO.read(getClass().getResourceAsStream("/Tabuleiros/dado6.jpg"));
				
				g2D.drawImage(dice_sides[4], 750, 100, 125, 125, null);
				g2D.drawImage(dice_sides[1], 1025, 100, 125, 125, null);
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
				System.exit(1);
			}
			// player color turn
			g2D.setPaint(color_array[2]);
			g2D.fillRect(900, 100, 100, 125);
			
			break;
		case 3: // mao
			Image hand_bg;
			try {
				hand_bg = ImageIO.read(getClass().getResourceAsStream("/Backgrounds/background.jpg"));
				g2D.drawImage(hand_bg, 0,0, 500, 500, null);
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
				System.exit(1);
			}
			
			break;
			
		case 4: // notebook
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
			break;
		}
		
		
		
		
		
	}
}
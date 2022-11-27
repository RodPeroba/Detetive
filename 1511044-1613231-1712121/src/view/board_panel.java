package view;

import java.awt.event.*;
import java.awt.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class board_panel extends JPanel {
	public board_panel() {
		this.setPreferredSize(new Dimension(1200,700));
		this.setLayout(null);
		
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
		
		this.add(button_chose_die_value);
		this.add(button_throw_die);
		this.add(button_secret_passage);
		this.add(button_show_hand);
		this.add(button_show_notebook);
		this.add(button_next_player);
		this.add(button_guess);
		this.add(button_accuse);
		this.add(button_save_game);
	}
	
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
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
	}


}

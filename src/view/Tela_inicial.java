package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Tela_inicial extends JFrame {
	
	public Tela_inicial(int width, int height, String title) {
		
		// make a frame
		//this.setSize(width, height);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle(title);
	}
	
	public static JFrame frame_start_menu() {
		JFrame frame = new Tela_inicial(1200, 700, "Detetive - Menu Inicial");
		JPanel p = Detetive_panel.main_menu_panel();
		frame.getContentPane().add(p);
		return frame;
	}
	
	public static JFrame frame_character_select() {
		JFrame frame = new Tela_inicial(1200, 700, "Detetive - Seleção de Personagem");
		JPanel p = Detetive_panel.character_panel();
		frame.getContentPane().add(p);
		return frame;
	}
	
	public static JFrame frame_board() {
		JFrame frame = new Tela_inicial(1200, 700, "Detetive - Tabuleiro");
		JPanel p = Detetive_panel.board_panel();
		frame.getContentPane().add(p);
		return frame;
	}
	
	public static JFrame frame_hand() {
		JFrame frame = new Tela_inicial(500, 500, "Detetive - Mão do jogador");
		JPanel p = Detetive_panel.hand_panel();
		frame.getContentPane().add(p);
		return frame;
	}
	
	public static JFrame frame_notebook() {
		JFrame frame = new Tela_inicial(500, 500, "Detetive - Mão do jogador");
		JPanel p = Detetive_panel.notebook_panel();
		frame.getContentPane().add(p);
		return frame;
	}
	
	public static JFrame format_frame(JFrame f) {
		f.pack();
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		return f;
	}
	
}


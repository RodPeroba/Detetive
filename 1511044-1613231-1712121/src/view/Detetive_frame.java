package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Detetive_frame extends JFrame {
	
	public Detetive_frame() {}
	
	public static JFrame frame_start_menu() {
		JFrame frame = new Detetive_frame();
		JPanel p = new menu_panel();
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Detetive - Menu Inicial");
		frame.getContentPane().add(p);
		return frame;
	}
	
	public static JFrame frame_character_select() {
		JFrame frame = new Detetive_frame();
		JPanel p = Detetive_panel.character_panel();
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Detetive - Seleção de Personagem");
		frame.getContentPane().add(p);
		return frame;
	}
	
	public static JFrame frame_board() {
		JFrame frame = new Detetive_frame();
		JPanel p = new board_panel();
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Detetive - Tabuleiro");
		frame.getContentPane().add(p);
		return frame;
	}
	
	public static JFrame frame_hand() {
		JFrame frame = new Detetive_frame();
		JPanel p = new hand_panel();
		
		frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
		frame.setTitle("Detetive - Mão do jogador");
		frame.getContentPane().add(p);
		return frame;
	}
	
	public static JFrame frame_notebook() {
		JFrame frame = new Detetive_frame();
		JPanel p = new note_panel();
		
		frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
		frame.setTitle("Detetive - Bloco de Notas");
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


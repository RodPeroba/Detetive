import javax.swing.JFrame;

import Modal.ModalManager;
import view.Detetive_frame;


public class main {

	static int numJogadores = 3;
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ModalManager meuManager = ModalManager.getModalManager(numJogadores);
		
		System.out.println("Terminando");
		
		JFrame frame_menu;
		JFrame frame_board;
		JFrame frame_character_select;
		JFrame frame_hand;
		JFrame frame_notebook;
		
		frame_menu = Detetive_frame.frame_start_menu();
		frame_character_select = Detetive_frame.frame_character_select();
		frame_board = Detetive_frame.frame_board();
		frame_hand = Detetive_frame.frame_hand();
		frame_notebook = Detetive_frame.frame_notebook();
		
		Detetive_frame.format_frame(frame_menu);
		Detetive_frame.format_frame(frame_character_select);
		Detetive_frame.format_frame(frame_board);
		Detetive_frame.format_frame(frame_hand);
		Detetive_frame.format_frame(frame_notebook);
	}

}

package view;

import java.awt.Color;

import javax.swing.*;

public class Detetive_frame {

	public static void main(String[] args) {
		// tela de inicio
		JFrame frame;
		
		//frame = Tela_inicial.frame_start_menu();
		
		//frame = Tela_inicial.frame_character_select();
		
		frame = Tela_inicial.frame_board();
		
		//frame = Tela_inicial.frame_hand();
		
		//frame = Tela_inicial.frame_notebook();
		Tela_inicial.format_frame(frame);
		
		
	}

}

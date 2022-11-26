import javax.swing.JFrame;

import Modal.ModalManager;
import view.Detetive_frame;


public class main {

	static int numJogadores = 3;
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ModalManager meuManager = ModalManager.getModalManager();
		
		System.out.println("Terminando");
		
		JFrame frame;
		
		// Testes das GUIs
		// tirar comentario da tela que quiser testar e comentar a outra
		// faltou implementar a funcionalidade dos botões, entao nao da pra testar o fluxo de telas ainda
		// frame da mao do jogador faltou implementação, principalmente por depender mais da parte modal
		// frame do tabuleiro precisa implementar a parte da cor do jogador dependendo de quem é o turno. versao atual apenas para testes
		// tabuleiro tambem precisa ajustar os botoes para selecionar valor no dado
		
//		frame = Detetive_frame.frame_start_menu();
//		frame = Detetive_frame.frame_character_select();
		frame = Detetive_frame.frame_board();
//		frame = Detetive_frame.frame_hand();
//		frame = Detetive_frame.frame_notebook();
		
		Detetive_frame.format_frame(frame);
	}

}

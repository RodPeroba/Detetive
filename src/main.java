import Modal.ModalManager;


public class main {

	static int numJogadores = 3;
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ModalManager meuManager = ModalManager.getModalManager(numJogadores);
		
		System.out.println("Terminando");
	}

}

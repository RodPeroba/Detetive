package Modal;

public class Jogador {
	
	Casa posicao;
	String personagem;
	Carta mao [] ;
	
	Jogador(String personagem,Casa posicao){
		
		this.personagem = personagem;
		this.posicao = posicao;
		
	}
	
	public void darPalpite(String suspeito, String arma, String comodo) {
		//Mostrar na tela as cartas do palpite
	}
	
	public void move(int x,int y) {
		posicao.move(x, y);
	}
	
	public int jogaDado() {
		return Dado.rolaDado();
	}
	
	boolean fazerAcusacao(String suspeito, String arma, String comodo) {

		String verdadeiroSuspeito = Tabuleiro.getSuspeito();
		String verdadeiraArma = Tabuleiro.getArma();
		String verdadeiroComodo = Tabuleiro.getComodo();
		
		if (suspeito == verdadeiroSuspeito)
			if (arma == verdadeiraArma)
				if(comodo == verdadeiroComodo)
					return true;
		
		return false;
	}
}

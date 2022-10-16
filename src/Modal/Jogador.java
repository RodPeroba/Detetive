package Modal;

public class Jogador {
	
	Casa posicao;
	String personagem;
	// Casa 
	
	Jogador(String personagem,Casa posicao){
		
		this.personagem = personagem;
		this.posicao = posicao;
		// this.posicao_rodada_anterior = posicao;
		// this.cartas ... 
		// this.flag_ativo = flag;
		
	}

	
	public void move(int x,int y) {
		posicao.move(x, y);
	}
	
	public int jogaDado() {
		return Dado.rolaDados();
	}
	
	
	public void darPalpite(String suspeito, String arma, String comodo) {
		//Pensar onde vai ficar os dados, interacao entre jogadores
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

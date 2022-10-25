package Modal;

import java.util.ArrayList;

public class Jogador {
	
	Casa posicao;
	String personagem;
	ArrayList<Carta> mao = null;
	Tabuleiro tabuleiro = null;
	
	Jogador(String personagem,Casa posicao){
		
		this.personagem = personagem;
		this.posicao = posicao;
		tabuleiro = Tabuleiro.getTabuleiro();
		
	}
	
	public void darPalpite(String suspeito, String arma, String comodo) {
		//Mostrar na tela as cartas do palpite
	}
	
	public void move(int x,int y) {
		posicao.move(x, y);
	}
	
	public int jogaDado() {
		Dado.rolaDado();
		return Dado.valorDoDado;
	}
	
	boolean fazerAcusacao(String suspeito, String arma, String comodo) {

		Carta verdadeiroSuspeito = tabuleiro.getSuspeito();
		Carta verdadeiraArma = tabuleiro.getArma();
		Carta verdadeiroComodo = tabuleiro.getComodo();
		
		if (suspeito == verdadeiroSuspeito.getValue())
			if (arma == verdadeiraArma.getValue())
				if(comodo == verdadeiroComodo.getValue())
					return true;
		
		return false;
	}
}

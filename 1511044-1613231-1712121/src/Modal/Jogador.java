package Modal;

import java.util.ArrayList;

public class Jogador {//TODO provavelmente vai implementar um listener para quando atualizar a casa atualizar a tela
	
	Casa pos;
	String personagem;
	ArrayList<Carta> mao = new ArrayList<Carta>();
	Tabuleiro tabuleiro = null;
	Comodo comodo = null;
	Dado dado =  Dado.getDado();
	
	Jogador(String personagem,Casa posicao){
		
		this.personagem = personagem;
		this.pos = posicao;
		tabuleiro = Tabuleiro.getTabuleiro();
		
	}
	
	public void darPalpite(String suspeito, String arma, String comodo) {
		//Mostrar na tela as cartas do palpite
	}
	
	public void move(int x,int y) { // mover + x e + y lugares
		if (tabuleiro.matrizDePosicao[pos.x + x][pos.y + y].isEmpty == false) {
			System.out.println("Movimento debilitado, tem alguem ocupando a casa");
			return;
		}
		pos.isEmpty = true;
		if (tabuleiro.matrizDePosicao[pos.x + x][pos.y + y].isWalkable) {
			pos = tabuleiro.matrizDePosicao[pos.x+x][pos.y+y];
			if(tabuleiro.matrizDePosicao[pos.x][pos.y].isPorta) {
				if (comodo != null) {
					//Esta num comodo e ta saindo
					pos = tabuleiro.matrizDePosicao[pos.x+x][pos.y+y];;
					comodo = null;
				}
				else {
					for (int i = 0;i < tabuleiro.comodos.size();i++) {
						Comodo comodoToTest = tabuleiro.comodos.get(i);
						if(pos.x + x == comodoToTest.getX() && pos.y + y == comodoToTest.getY()) {
							comodo = comodoToTest;
						}
					}
					pos = tabuleiro.matrizDePosicao[pos.x+x][pos.y+y];;
				}
			}
			pos.isEmpty = false;
			return;
		}
		//raise exception
		System.out.println("movimento invalido");
	}
	
	public int jogaDado() {
		dado.rolaDado();
		return Dado.valorDoDado1 + Dado.valorDoDado2;
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

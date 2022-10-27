package Modal;

import java.util.ArrayList;

public class Tabuleiro {
	
	private ArrayList<Carta> envelope = null;
	private static Tabuleiro tabuleiro = null;
	protected Casa matrizDePosicao[][] = new Casa[24][25];
	private int walkables[][] = {{,}};//TODO fazer lista
	private int portas [][] = {{5,8},{8,6},{10,9},{15,9},{17,6},{19,6},{18,10},{21,14},{23,14},{17,17},{18,21},{19,21},{16,18},{15,18},{10,19},{10,17},{12,13}};
	protected ArrayList<Comodo> comodos = new ArrayList<Comodo>();//TODO fazer lista
	private Tabuleiro (){
		for(int i = 0;i < matrizDePosicao.length;i++) {
			for(int j = 0;j < matrizDePosicao[i].length;j++) {
				matrizDePosicao[i][j] = new Casa(i,j,isPorta(i,j),isWalkable(i,j));
			}
		}
	}

	protected static Tabuleiro getTabuleiro() {
		if (tabuleiro == null)
			tabuleiro = new Tabuleiro();
		return tabuleiro;
	}
	
	protected Boolean IsEnvelopeEmpty() {
		if(envelope==null)
			return true;
		return false;
	}
		
	protected Carta getSuspeito() {
		for (int i = 0; i < envelope.size();i++) {
			if (envelope.get(i).getTipo() == 1)
				return envelope.get(i);
		}
		return null;
	}

	protected Carta getArma() {
		for (int i = 0; i < envelope.size();i++) {
			if (envelope.get(i).getTipo() == 0)
				return envelope.get(i);
		}
		return null;
	}

	protected Carta getComodo() {
		for (int i = 0; i < envelope.size();i++) {
			if (envelope.get(i).getTipo() == 2)
				return envelope.get(i);
		}
		return null;
	}
	private boolean isPorta (int x,int y) {
		for(int i = 0;i < portas.length;i++) {
			for(int j = 0;j < portas[i].length;j++) {
				if (x == i && y == j)
					return true;
			}
		}
		return false;
	}
	private boolean isWalkable (int x,int y) {
		for(int i = 0;i < walkables.length;i++) {
			for(int j = 0;j < walkables[i].length;j++) {
				if (x == i && y == j)
					return true;
			}
		}
		return false;
	}

	public void AdicionaAoEnvelope(Carta novaCarta) {
		if (envelope ==null)
			envelope = new ArrayList<Carta>();
		envelope.add(novaCarta);
		System.out.println("Carta adicionada ao envelope -> " + novaCarta.getValue());
		//TODO Ordenar ???
		// acho q ja vai ordenar sozinho -Rodrigo
	}
	
}

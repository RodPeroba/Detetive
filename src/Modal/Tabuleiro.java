package Modal;

import java.util.ArrayList;

public class Tabuleiro {
	
	private ArrayList<Carta> envelope = null;
	private static Tabuleiro tabuleiro = null;
	protected Casa matrizDePosicao[][] = new Casa[24][25];
	private int walkables[][] = {{0,9},{0,14},{1,7},{1,8},{1,9},{1,14},{1,15},{1,16},{2,6},{2,7},{2,16},{2,17},{3,6},{3,7},{3,16},{3,17},{4,7},{4,6},{4,16},{4,17},{5,6},{5,7},{5,16},{5,17},{5,18},{6,6},{6,7},{6,16},{6,17},{6,18},{6,19},{6,20},{6,21},{6,22},{6,23},{7,0},{7,1},{7,2},{7,3},{7,4},{7,5},{7,6},{7,7},{7,16},{7,17},{7,18},{7,19},{7,20},{7,21},{7,22},{7,23},{8,1},{8,2},{8,3},{8,4},{8,5},{8,6},{8,7},{8,8},{8,9},{8,10},{8,11},{8,12},{8,13},{8,14},{8,15},{8,16},{8,17},{9,5},{9,6},{9,7},{9,8},{9,9},{9,10},{9,11},{9,12},{9,13},{9,14},{9,15},{9,16},{9,17},{10,8},{10,9},{10,15},{10,16},{10,17},{11,8},{11,9},{11,15},{11,16},{11,17},{12,8},{12,9},{12,15},{12,16},{12,17},{13,8},{13,9},{13,15},{13,16},{13,17},{13,18},{13,19},{13,20},{13,21},{13,22},{14,8},{14,9},{14,15},{14,16},{14,17},{15,8},{15,9},{15,15},{15,16},{1,16},{2,16},{3,16},{4,16},{5,16},{6,16},{7,16},{8,16},{9,16},{15,16},{16,16},{0,17},{1,17},{2,17},{3,17},{4,17},{5,17},{6,17},{7,17},{8,17},{9,17},{10,17},{11,17},{12,17},{13,17},{14,17},{15,17},{16,17},{1,18},{2,18},{3,18},{4,18},{5,18},{6,18},{7,18},{8,18},{15,18},{16,18},{17,18},{7,19},{8,19},{15,19},{16,19},{17,19},{18,19},{19,19},{20,19},{21,19},{22,19},{23,19},{7,20},{8,20},{15,20},{16,20},{17,20},{18,20},{19,20},{20,20},{21,20},{22,20},{7,21},{8,21},{15,21},{16,21},{7,22},{8,22},{15,22},{16,22},{7,23},{8,23},{15,23},{16,23},{7,24},{16,24}};
	private int portas [][] = {{5,8},{8,6},{10,9},{15,9},{17,6},{19,6},{18,10},{21,14},{23,14},{17,17},{18,21},{19,21},{16,18},{15,18},{10,19},{10,17},{12,13}};
	protected ArrayList<Comodo> comodos = new ArrayList<Comodo>();//TODO fazer lista
	protected int spawners [][] = {{10,0},{15,0},{23,6},{14,19},{0,18},{7,24}};//TODO talvez uma classe de spawners

	private Tabuleiro (){
		for(int i = 0;i < matrizDePosicao.length;i++) {
			for(int j = 0;j < matrizDePosicao[i].length;j++) {
				matrizDePosicao[i][j] = new Casa(i,j,isPorta(i,j),isWalkable(i,j));
			}
		}
		//TODO Adicionar passagem secreta
		Comodo cozinha = new Comodo(3,3,ComodosEnum.cozinha);
		cozinha.portas.add(new int[]{4,7});
		comodos.add(cozinha);
		Comodo salaDeMusica = new Comodo(4,11,ComodosEnum.salaDeMusica);
		salaDeMusica.portas.add(new int[]{7,4});
		salaDeMusica.portas.add(new int[]{7,16});
		salaDeMusica.portas.add(new int[]{9,8});
		salaDeMusica.portas.add(new int[]{14,8});
		comodos.add(salaDeMusica);
		Comodo jardimDeInverno = new Comodo(20,3,ComodosEnum.jardimDeInverno);
		jardimDeInverno.portas.add(new int[] {18,5});
		comodos.add(jardimDeInverno);
		Comodo salaoDeJogos = new Comodo(20,10,ComodosEnum.salaoDeJogos);
		salaoDeJogos.portas.add(new int[] {17,9});
		salaoDeJogos.portas.add(new int[] {22,13});
		comodos.add(salaoDeJogos);
		Comodo biblioteca =new Comodo(20,16,ComodosEnum.biblioteca); 
		biblioteca.portas.add(new int[] {20,13});
		biblioteca.portas.add(new int[] {16,16});
		comodos.add(biblioteca);
		Comodo escritorio = new Comodo(19,22,ComodosEnum.escritorio);
		escritorio.portas.add(new int[] {17,20});
		comodos.add(escritorio);
		Comodo entrada = new Comodo(11,21,ComodosEnum.entrada);
		entrada.portas.add(new int[] {15,20});
		entrada.portas.add(new int[] {11,17});
		entrada.portas.add(new int[] {12,17});
		comodos.add(entrada);
		Comodo salaDeEstar = new Comodo(3,22,ComodosEnum.salaDeEstar);
		salaDeEstar.portas.add(new int[] {6,18});
		comodos.add(salaDeEstar);
		Comodo salaDeJantar = new Comodo(3,12,ComodosEnum.salaDeJantar);
		salaDeJantar.portas.add(new int[] {6,16});
		salaDeJantar.portas.add(new int[] {8,12});
		comodos.add(salaDeJantar);
		
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

package Modal;

import java.util.ArrayList;

public class Tabuleiro {
	
	//TODO gerar as armas aleatoriamento
	private Carta arma = new Carta ("Arma",0);
	private Carta suspeito = new Carta ("Fulano",1);
	private Carta comodo = new Carta ("Comodo",2);
	private ArrayList<Carta> envelope = null;
	private static Tabuleiro tabuleiro = null;
	private Tabuleiro (){}

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
		return suspeito;
	}

	protected Carta getArma() {
		return arma;
	}

	protected Carta getComodo() {
		return comodo;
	}

	public void AdicionaAoEnvelope(Carta novaCarta) {
		envelope.add(novaCarta);
		//TODO Ordenar ???
		// acho q ja vai ordenar sozinho -Rodrigo
	}
	
}

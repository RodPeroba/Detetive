package Modal;

import java.util.ArrayList;

public class Tabuleiro {
	
	//private Carta arma = new Carta ("Arma",0);
	//private Carta suspeito = new Carta ("Fulano",1);
	//private Carta comodo = new Carta ("Comodo",2);
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

	public void AdicionaAoEnvelope(Carta novaCarta) {
		if (envelope ==null)
			envelope = new ArrayList<Carta>();
		envelope.add(novaCarta);
		System.out.println("Carta adicionada ao envelope -> " + novaCarta.getValue());
		//TODO Ordenar ???
		// acho q ja vai ordenar sozinho -Rodrigo
	}
	
}

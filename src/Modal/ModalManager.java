package Modal;

import java.util.ArrayList;
import java.util.Collections;

public class ModalManager {
	
	private static ModalManager controle = null;
	Tabuleiro tabuleiro = Tabuleiro.getTabuleiro();
	ArrayList<Carta> cartas = new ArrayList<Carta>();
	int numJogadores;
	
	private ModalManager(int numJogadores){
		
		this.numJogadores = numJogadores;
		
		CreateDeck();
		Collections.shuffle(cartas);
		SeparaEnvelope();
		SeparaMao();
	}
	
	public static ModalManager getModalManager(int numJogadores) {
		if (controle == null) {
			controle = new ModalManager(numJogadores);
		}
		return controle;
	}
	
	private void CreateDeck() {
		if (!cartas.isEmpty())
			return;//Raise exception???
		//Armas
		cartas.add(new Carta("Corda",0));
		cartas.add(new Carta("Cano de Chumbo",0));
		cartas.add(new Carta("Faca",0));
		cartas.add(new Carta("Chave Inglesa",0));
		cartas.add(new Carta("Castical",0));
		cartas.add(new Carta("Revolver",0));
		//Suspeitos
		cartas.add(new Carta("Coronel Mustard",1));
		cartas.add(new Carta("Srta. Scarlet",1));
		cartas.add(new Carta("Professor Plum",1));
		cartas.add(new Carta("Reverendo Green",1));
		cartas.add(new Carta("Sra. White",1));
		cartas.add(new Carta("Sra. Peacock",1));
		//Comodos
		cartas.add(new Carta("Biblioteca",2));
		cartas.add(new Carta("Cozinha",2));
		cartas.add(new Carta("Entrada",2));
		cartas.add(new Carta("Escritorio",2));
		cartas.add(new Carta("Jardim de Inverno",2));
		cartas.add(new Carta("Sala de Estar",2));
		cartas.add(new Carta("Sala de Jantar",2));
		cartas.add(new Carta("Sala de Musica",2));
		cartas.add(new Carta("Salao de Jogos",2));
		
	}
	
	protected void SeparaEnvelope() {
		//Assume baralho embaralhado para sorteio proprio do envelope
		if (tabuleiro.IsEnvelopeEmpty()){
			for (int i = 0;i < 3; i++) {
				int contador = 0;
				while(cartas.get(contador).getTipo() != i) {
					contador++;
				}
				tabuleiro.AdicionaAoEnvelope(cartas.remove(contador));
			}
		}
	}
	protected void SeparaMao() {
		//TODO tudo
	}
}

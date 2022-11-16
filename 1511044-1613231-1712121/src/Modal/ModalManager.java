package Modal;

import java.util.ArrayList;
import java.util.Collections;

public class ModalManager {
	
	private static ModalManager controle = null;
	Tabuleiro tabuleiro = Tabuleiro.getTabuleiro();
	ArrayList<Carta> cartas = new ArrayList<Carta>();
	int numJogadores;
	ArrayList<Jogador> jogadores; 
	
	private ModalManager(int numJogadores){
		
		this.numJogadores = numJogadores;
		jogadores = new ArrayList<Jogador>();
		for(int i = 0;i < numJogadores;i++)
			jogadores.add(new Jogador("Fulano",null));///TODO trocar isso, talvez tirar a casa como requerimento pra criar o objeto
		CreateDeck();
		Collections.shuffle(cartas);
		SeparaEnvelope();
		SeparaMao();
		//Exibindo o evelope para debug
		System.out.println("Arma do crime -> " + tabuleiro.getArma().getValue());
		System.out.println("Meliante -> " + tabuleiro.getSuspeito().getValue());
		System.out.println("Local do crime -> " + tabuleiro.getComodo().getValue());
		for(int i = 0;i < jogadores.size();i++) {
			System.out.println("Cartas do jogador " + i);
			for (int j = 0;j < jogadores.get(i).mao.size(); j++) {
				System.out.println(jogadores.get(i).mao.get(j).getValue());
			}
		}
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
		//Assume baralho embaralhado
		//Em vez de assumir isso, n poderia so embaralhar e 
		//to nem ai pra eficiencia ? - Rodrigo
		int contador = 0;
		while(cartas.isEmpty() == false) {
			jogadores.get(contador).mao.add(cartas.get(0));
			cartas.remove(0);
			contador++;
			if (contador >= numJogadores)
				contador = 0;
		}
		System.out.println("Cartas distribuidas");
	}
}

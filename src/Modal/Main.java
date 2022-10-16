package Modal;

public class Main {

	public static void main(String[] args) {
		final int total_personagens = 6;
		final int total_armas = 6;
		final int total_comodos = 9;
		
		String nome_personagens[] = {"Srta. Scarlet", "Coronel Mustard", "Professor Plum", "Reverendo Geren", "Sra. White", "Sra. Peacock"};
		String nome_comodos[] = {"Escritório", "Sala de Estar", "Hall", "Biblioteca", "Sala de Jogos", "Sala de Jantar", "Cozinha", "Salão de Festas", "Sala de Música"};
		String nome_armas[] = {"Corda", "Cano de Chumbo", "Faca", "Chave Inglesa", "Castiçal", "Revólver"};
		
		Casa casa_inicial = new Casa(0,0); // coordenadas sujeitas a mudanças
		
		Jogador player[] = new Jogador[6];
		player[0] = new Jogador(nome_personagens[0], casa_inicial);
		player[1] = new Jogador(nome_personagens[1], casa_inicial);
		player[2] = new Jogador(nome_personagens[2], casa_inicial);
		player[3] = new Jogador(nome_personagens[3], casa_inicial);
		player[4] = new Jogador(nome_personagens[4], casa_inicial);
		player[5] = new Jogador(nome_personagens[5], casa_inicial);
		
		
	}

}

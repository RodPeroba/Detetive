package Modal;

public class Carta {
	String nome;
	int tipo; 
	//tipos: 0 = personagem, 1 = comodo, 2 = arma
	
	Carta(String nome, int tipo){
		this.nome = nome;
		this.tipo = tipo;
	}
	
	Carta[] ini_cartas(String[] lista_nome_personagens, int num_personagens,
					   String[] lista_nome_comodos, int num_comodos,
					   String[] lista_nome_armas, int num_armas) {
		
		int count, list_count = 0;
		int total_cartas = num_personagens + num_comodos + num_armas;
		
		Carta[] lista_cartas = new Carta[total_cartas];
		
		for(count = 0; count < num_personagens; count++, list_count++) {
			lista_cartas[list_count] = new Carta(lista_nome_personagens[count], 0);
		}
		
		for(count = 0; count < num_comodos; count++, list_count++) {
			lista_cartas[list_count] = new Carta(lista_nome_comodos[count], 1);
		}
		
		for(count = 0; count < num_armas; count++, list_count++) {
			lista_cartas[list_count] = new Carta(lista_nome_armas[count], 2);
		}
		return lista_cartas;
	}
	
	Carta[] define_solucao() {
		// escolhe 3 cartas, uma de cada tipo e "poe no envelope"
	}
	
	void distribui_cartas() {
		// distribui cartas restantes aleatoriamente entre os jogadores ativos
	}
	
	int compara_acusacao_solucao(Carta[] acusacao) {
		// return 1 se acusação certa
		// return 0 se acusação errada
	}
	
}

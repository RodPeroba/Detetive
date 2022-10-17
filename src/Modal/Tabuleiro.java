package Modal;
import java.util.Random;

public class Tabuleiro {
	
	//TODO gerar as armas aleatoriamento
	static String suspeito = "Fulano";
	static String arma = "Faca";
	static String comodo = "Cozinha";
	static Casa tabuleiro [][] = new Casa [10][10];
	String nome_comodos[] = {"Escritório", "Sala de Estar", "Hall", "Biblioteca", "Sala de Jogos", "Sala de Jantar", "Cozinha", "Salão de Festas", "Sala de Música"};
	int num_armas = 6;
	Comodo comodos [] = new Comodo[nome_comodos.length];
	
	Tabuleiro (){
		//TODO montar o tabuleiro depois que sair o mapa
		for (int i = 0; i < nome_comodos.length;i++) {
			comodos[i] = new Comodo(nome_comodos[i],0);
		}
		for (int i = 0; i < num_armas;i++) {
			sorteia_arma();
		}
	}
	

	protected static String getSuspeito() {
		return suspeito;
	}

	protected static String getArma() {
		return arma;
	}

	protected static String getComodo() {
		return comodo;
	}
	private void sorteia_armas(String arma) {
		Random random = new Random();
		int posicao = Random.nextInt(comodos.length);
		while(comodos[posicao].tem_arma()) {
			posicao = Random.nextInt(comodos.length);
		}
		comodos[posicao].atribui_arma(String arma);
	}
	
}

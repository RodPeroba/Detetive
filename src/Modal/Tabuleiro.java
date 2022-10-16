package Modal;

public class Tabuleiro {
	
	//TODO gerar as armas aleatoriamento
	static String suspeito = "Fulano";
	static String arma = "Faca";
	static String comodo = "Cozinha";
	static Casa tabuleiro [][] = new Casa [10][10];

	Tabuleiro (){
		
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
	
}

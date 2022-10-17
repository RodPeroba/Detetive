package Modal;

public class Comodo extends Casa{
	
	String nome_comodo;
	String arma;
	Casa coordenadas_portas[];
	int passagem_secreta;
	
	
	Comodo(String nome_comodo,int passagem_secreta) {		
		
		this.nome_comodo = nome_comodo;
		//this.coordenadas_portas = coordenadas_portas; colocar depois de saber o mapa
		this.passagem_secreta = passagem_secreta;
		arma = Null;
		// se n tem passagem secreta = 0, se tem, dois comodos tem passagem_secreta = 1 ou 2 ou 3 ...
	}
	
	String get_nome() {
		return nome_comodo;
	}
	
	Casa get_coordenadas_das_portas() {
		return coordenadas_portas;
	}
	
	Casa usar_passagem_secreta(Comodo lista_de_comodos[]) {
		int count = 0; 
		while (passagem_secreta != lista_de_comodos[count].passagem_secreta) {
			count++;
		}
		return lista_de_comodos[count].get_coordenadas();
	}
	
	protected boolean tem_arma() {
		if arma == Null{
			return False;
		}
		return True;
	}
	protected void atribui_arma(String = arma) {
		this.arma = arma;
	}
}

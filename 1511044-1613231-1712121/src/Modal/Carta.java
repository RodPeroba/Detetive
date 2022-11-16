package Modal;

public class Carta {

	private int tipo; // tipo 0 = arma *** tipo 1 = personagem *** tipo 2 = comodo
	private String value;
	
	protected Carta(String value, int tipo){
		
		this.value = value;
		this.tipo = tipo;
		
	}
	
	public String getValue() {
		return value;
	}
	
	protected int getTipo() {
		return tipo;
				
	}
}

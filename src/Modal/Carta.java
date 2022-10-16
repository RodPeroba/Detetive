package Modal;

public abstract class Carta {
	
	int tipo;
	String value;
	
	Carta(String value){
		
		this.value = value;
		
	}
	
	public String getValue() {
		return value;
	}
}

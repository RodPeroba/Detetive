package Modal;

import java.util.Random;

public class Dado {
	static Random rand = new Random();
	static int limiteDoDado = 6;
	
	static int rolaDado() {
		return rand.nextInt(limiteDoDado) + 1;
	}
	
	
}

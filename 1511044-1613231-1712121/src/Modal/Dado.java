package Modal;

import java.util.Random;
//TODO analisar mudagem de pattern para singleton
public class Dado {
	static Random rand = new Random();
	static int limiteDoDado = 6;
	static int valorDoDado1 = -1;
	static int valorDoDado2 = -1;
	static void rolaDado() {//rola 2 dados
		valorDoDado1 = rand.nextInt(limiteDoDado) + 1 ;
		valorDoDado2 = rand.nextInt(limiteDoDado) + 1 ;
	}
	
	
}

package Modal;

import java.util.Random;
//TODO analisar mudagem de pattern para singleton
public class Dado {
	static Random rand = new Random();
	static int limiteDoDado = 6;
	static int valorDoDado = -1;
	static void rolaDado() {//rola 2 dados
		valorDoDado =  rand.nextInt(limiteDoDado) + rand.nextInt(limiteDoDado) + 2 ;
	}
	
	
}

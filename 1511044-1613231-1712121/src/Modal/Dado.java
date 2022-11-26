package Modal;

import java.util.Random;

public class Dado {
	private static Dado dado = null;
	static Random rand = new Random();
	static int limiteDoDado = 6;
	static int valorDoDado1 = -1;
	static int valorDoDado2 = -1;
	
	private Dado() {}
	
	public static Dado getDado() {
		if (dado == null) {
			dado = new Dado();
		}
		return dado;
	}
	
	public void rolaDado() {//rola 2 dados
		valorDoDado1 = rand.nextInt(limiteDoDado) + 1 ;
		valorDoDado2 = rand.nextInt(limiteDoDado) + 1 ;
	}
	public void forcaDado(int n) {
		valorDoDado1 = n/2;
		valorDoDado2 = n - valorDoDado1;
		System.out.println(valorDoDado1);
		System.out.println(valorDoDado2);
		
	}
	
}

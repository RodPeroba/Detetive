package Modal;

import java.util.ArrayList;

public class Comodo {
	
	private int x,y;
	protected ArrayList<Casa> portas = new ArrayList<Casa>();
	
	Comodo(int x,int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}	
}

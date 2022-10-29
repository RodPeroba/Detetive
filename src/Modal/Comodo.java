package Modal;

import java.util.ArrayList;

public class Comodo {
	
	private int x,y;
	ComodosEnum id;
	protected ArrayList<int[]> portas = new ArrayList<int[]>();
	
	Comodo(int x,int y, ComodosEnum id){
		this.x = x;
		this.y = y;
		this.id = id;
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}

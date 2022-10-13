package Modal;

public class Casa {
	private int x,y;
	
	Casa(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	protected void move(int x, int y) { // Move + x casas em x e y casas em y
		
		this.x += x;
		this.y += y;
	}
	
	protected int getX(){
		return x;
	}
	
	protected int getY() {
		return y;
	}
}

package Modal;

class Casa {
	protected int x,y;//TODO Sepa tudo isso e private e criar metodos get
	protected boolean isPorta;
	protected boolean isWalkable;
	protected boolean isEmpty = true;
	Comodo comodo = null; // Se for porta, tem salvo o comodo para qual ele vai
	
	Casa(int x, int y, boolean isPorta, boolean isWalkable){
		
		this.x = x;
		this.y = y;
		this.isPorta = isPorta;
		this.isWalkable = isWalkable;
	}
	Casa(int x, int y, boolean isPorta, boolean isWalkable,Comodo comodo){
		
		this.x = x;
		this.y = y;
		this.isPorta = isPorta;
		this.isWalkable = isWalkable;
		this.comodo = comodo;
	}
	protected int getX(){
		return x;
	}
	
	protected int getY() {
		return y;
	}
	/*
	protected boolean IsPorta() {
		return isPorta;
	}
	protected boolean IsWalkable() {
		return isWalkable;
	}
	*/
	
}

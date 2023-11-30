package Lv_2;

public abstract class Creature {
	private int x;
	


	public Creature(int x) {
		super();
		this.x = x;
		
	}
	
	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}




	public abstract void attack();	// 생명체 공격
	public abstract void printInfo(); 	// 출력 정보 

	
	public int status(int x_distance) {
		x += x_distance;
		return x;
	}


}

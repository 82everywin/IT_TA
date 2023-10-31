package Class;

public class Rectangle {
	int x,y,width,height;

	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	// 넓이
	public int square() {
		int sq = width * height;
		return sq;
	}

	public void show() {
		System.out.println("("+x+","+y+") 에서 크기가 "+width+"x"+height+"인 사각형");
		
	}
}

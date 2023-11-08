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
	
	public int square() {
		return width * height;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	public boolean contains(Rectangle r) {
		if(x<r.x && y<r.y && r.x+r.width<x+width && r.y+r.height <y+height)return true;
		return false;
	}

}

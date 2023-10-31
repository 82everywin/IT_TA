package Inheritance;

class Main{
	public static void main(String[] args) {
		
		ColorPoint c = new ColorPoint(5,5,"Blue");
		c.showPoint();
		
		
		
	}
}

class ColorPoint extends Point{
	String color;
	
	public ColorPoint(int x,int y, String color) {
		super(x,y);
		this.color= color;
	}
	@Override
	public void showPoint() {
		
		System.out.println(color+"("+x+","+y+")");	}
}

class Point{
	
	int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
	
}



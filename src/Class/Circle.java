package Class;

public class Circle {
	private double x,y;
	private int radius;
	
	
	//생성자 
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y= y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("원의 좌표 : ("+x+","+y+") 반지름 : "+radius);
	}
}

// x, y, radius 초기화

// 3개의 Circle 배열 선언

// x 값 읽기
// y 값 읽기
// radius 값 읽기
// Circle 객체 생성 
// 모든 Circle 객체 출력 
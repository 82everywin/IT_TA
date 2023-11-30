package Lv_2;

public class Turtle extends Animal implements Swimable{

	int status_r;
	public Turtle(int x) {
		super(x);
		status_r += x;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		status_r=status(30);
		System.out.println("거북이지만 수영은 할 줄 알아");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("거북이 능력치 :" + status_r);
	}
	
	

}

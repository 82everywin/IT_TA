package Lv_2;

public class Turtle extends Animal implements Swimable{

	int status_r;
	public Turtle(String name,int x,int age) {
		super(name,x,age);
		status_r += x;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		status_r=status(20);
		System.out.println("수영을 할 수 있게 되었습니다. 능력치 20 상승");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println(getName() +" 능력치 : " + status_r + " 나이 : " + getAge());
	
	}
	
	public void breath() {
		status_r = status(20);
		System.out.println("++ 특수능력 : 물에서 숨을 쉴 수 있습니다. 능력치 20 상승");
	}
	
	

}

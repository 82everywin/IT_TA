package Lv_2;

public class Pigeon extends Animal implements Flyable{
	int status_r;
	public Pigeon(String name,int x,int age) {
		super(name,x,age);
		status_r += x;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		status_r=status(10);
		System.out.println("날 수 있게 되었습니다. 능력치 10 상승");
	}
	
	public void move() {
		status_r = status(20);
		System.out.println("++특수능력 : 돌아 다닙니다. 능력치 20 상승");
	}

	@Override
	public void printInfo() {
		
		System.out.println(getName()+"능력치 : " + status_r+ " 나이 : "+getAge());
	
	}

}

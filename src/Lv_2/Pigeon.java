package Lv_2;

public class Pigeon extends Animal implements Flyable{
	int status_r;
	public Pigeon(int x) {
		super(x);
		status_r += x;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		status_r=status(30);
		System.out.println("비둘기만 날 줄 알아^^");
	}

	@Override
	public void printInfo() {
		System.out.println("비둘기 능력 : " + status_r);
		
	}

}

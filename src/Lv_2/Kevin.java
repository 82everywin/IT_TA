package Lv_2;

public class Kevin extends Human implements Swimable,Programmer{

	int status_r;
	public Kevin(int x) {
		super(x);
		status_r += x;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printInfo() {
		
		System.out.println("Kevin 능력치 : "+ status_r);
		
	}

	@Override
	public void talk() {
		status_r = status(10);
		System.out.println("사람이니까 말을 할 수 있어");
	}

	@Override
	public void swim() {
	
		status_r = status(30);
		System.out.println("사람이니까 수영좀 해보려고");
	}
	
	public void coding() {
		status_r = status(20);
		System.out.println("");
	}
	
}

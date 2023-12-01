package Lv_2;

public class Kevin extends Human implements Swimable,Programmer{

	int status_r;
	public Kevin(String name,int x,int age) {
		super(name,x, age);
		status_r += x;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printInfo() {
		
		System.out.println(getName()+" 능력치 : "+ status_r +" 나이 : "+ getAge());
	
	}

	@Override
	public void swim() {
		status_r = status(20);
		System.out.println("수영을 할 수 있게 되었습니다. 능력치 20 상승");
	}
	
	public void coding() {
		status_r = status(30);
		System.out.println("코딩을 할 수 있게 되었습니다. 능력치 30 상승");
	}
	
}

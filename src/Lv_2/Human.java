package Lv_2;

public abstract class Human  extends Creature implements Talkable{

	public Human(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack() {
		System.out.println("인간은 도구를 사용하여 공격! ");
	}
	
	public void talk() {
		
		System.out.println(" 사람은 말을 할 수 있는 생명체임.");
	}

}

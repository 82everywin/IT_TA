package Lv_2;

public abstract class Human  extends Creature {

	// 기본 능력치와 나이 
	public Human(String name,int x, int age) {
		super(name,x,age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack() {
		System.out.println("인간은 도구를 사용하여 공격! ");
	}
	

}

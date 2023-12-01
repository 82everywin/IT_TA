package Lv_2;

public abstract class Animal extends Creature{

	public Animal(String name,int x ,int age) {
		super(name,x,age);
		// TODO Auto-generated constructor stub
	}
	
	public void attack() {
		
		System.out.println("기본 공격 : 동물은 자신의 신체로 공격합니다. ");
	}
	
	

}

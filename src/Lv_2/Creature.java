package Lv_2;

public abstract class Creature {
	private String name;
	private int x;
	private int age;


	//생명체에 기본 능력치와 나이
	public Creature(String name,int x,int age) {
		super();
		this.name = name;
		this.x = x;
		this.age= age;
		
	}
	
	public abstract void attack();	// 생명체 공격
	public abstract void printInfo(); 	// 출력 정보 
	
	public String  getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public void oldAge(int age) {
		this.age += age;
		totalAge();
	}
	
	public int status(int x_distance) {
		x += x_distance;
		return x;
	}
	
	
	public void totalAge() {
		if (age >50) {
			System.out.println("수명을 다했습니다... 전사합니다.");
		}
	}

}

package Lv_2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		// 능력치 , 나이 
		Pigeon p =new Pigeon("비둘기",10, 5);
		p.printInfo();
		p.attack();
		p.fly();
		p.move();
		p.printInfo();
		
		System.out.println("=====================");
		Turtle t = new Turtle("거북이",10,5);
		t.printInfo();
		t.attack();
		t.swim();
		t.breath();
		t.printInfo();
		
		System.out.println("=====================");
		Kevin k = new Kevin("Kevin",20,10);
		k.printInfo();
		k.attack();
		k.coding();
		k.oldAge(10);

		k.swim();
		k.printInfo();

		
	}
}

package Inheritance;

public class Clothes {
	
	String type;

	
	public Clothes(String type) {
		this.type= type;
		
	}

	public void new_price() {
		System.out.println("가격은 "+type+"입니다");
		
	}
}

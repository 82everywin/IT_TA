package Inheritance;

public class Reform extends Clothes{

	int cut_width;
	int cut_height;
	int price;
	
	public Reform(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public void set(int cut_width, int cut_height) {
		this.cut_width = cut_width;
		this.cut_height = cut_height;
	}
	
	@Override
	public void new_price() {
		super.new_price();
		price += cut_width;
		price += cut_height;
		
		System.out.println("수선 가격은 "+price+ "원입니다.");
	}
}


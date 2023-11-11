package Inheritance;

public class VIPCustomer extends Customer{

	double saleRatio;
	
	public VIPCustomer (String CustomerName) {
		this.CustomerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}
	
	@Override
	public void calcPrice(int Price) {

		super.calcPrice(Price);
		Price-= Price*saleRatio;
		
	}
	@Override
	public void showStatement() {
		System.out.printf("%s 님의 지불금액은 %d입니다. \n ",CustomerName,Price);
	}
	
}

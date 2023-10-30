package Inheritance;

public class VIPCustomer extends Customer{

	
	
	
	public VIPCustomer (String CustomerName) {
		super(CustomerName);
		CustomerGrade = "VIP";
		bonusRatio = 0.05;
	
	}
	
	@Override
	public void calcPrice(int Price) {
		super.calcPrice(Price);
		this.Price = Price - (int)(Price*0.1);
		
	}
	
	
}
package Inheritance;


public class CusMain {

	public static void main(String[] args) {
		 
		Customer cus = new Customer("박새로이");
		cus.calcPrice(10000);
		cus.showCustomer();
	
		VIPCustomer cus1 = new VIPCustomer("박과장");
		cus1.calcPrice(15000);
		cus1.showCustomer();

	
	
	}
	
}
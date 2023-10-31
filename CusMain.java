import java.util.Scanner;

public class CusMain {

	public static void main(String[] args) {
		 
		Customer cus = new Customer("박새로이");
		cus.setCustomerId("홍길동");
		String ID = cus.getCustomerId();
		System.out.println(ID);
		
		cus.calcPrice(10000);
		cus.showCustomerInfo();
		cus.showStatement();
	
		VIPCustomer cus1 = new VIPCustomer("박과장");
		cus1.calcPrice(15000);
		cus1.showCustomerInfo();
		cus1.showStatement();
	
	
	}
	
}

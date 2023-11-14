package Inheritance;

import java.util.Scanner;

public class CusMain {

	public static void main(String[] args) {
		 
		Customer cus = new Customer("박새로이");
		cus.calcPrice(10000);
		cus.showCustomerInfo();
		cus.showStatement();
	
		VIPCustomer cus1 = new VIPCustomer("박새로이");
		cus1.calcPrice(10000);
		cus1.showCustomerInfo();
		cus1.showStatement();
	
	
	}
	
}

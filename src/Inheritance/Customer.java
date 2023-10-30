package Inheritance;


public class Customer {
	
	// 고객 아이디
	String CustomerId; 
	
	// 고객 이름
	String CustomerName;
	
	// 고객 등급
	String CustomerGrade;
	
	// 보너스 포인트
	double bonusPoint;
	
	// 적립비율 
	double bonusRatio;
	
	// 금액
	int Price;
	
	public Customer() {}
	public Customer(String customerName) {
		this.CustomerName = customerName;
		this.CustomerGrade = "SILVER";
		this.bonusRatio = 0.01;
		
	}
	public void calcPrice(int Price) {
		this.bonusPoint = Price * bonusRatio;
		this.Price = Price;
	
	}
	public void showCustomer() {
		System.out.printf("==== %s ====\n",CustomerName);
		System.out.printf("%s님의 등급 : %s\n"
				+ "보너스 포인트 : %.1f\n"
				+ "지불금액 : %d\n\n",
				CustomerName,CustomerGrade,bonusPoint,Price);
	}
	
	


}
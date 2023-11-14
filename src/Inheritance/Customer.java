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
	}
	public void showCustomerInfo() {
		
		System.out.printf("%s님의 등급 : %s\n보너스 포인트는 %.1f입니다.\n",CustomerName,CustomerGrade,bonusPoint);
	}
	
	public void showStatement() {
		System.out.printf("%s 님의 지불금액은 %d입니다. \n ",CustomerName,Price);
	}


}

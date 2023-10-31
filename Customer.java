
public class Customer {
	
	// 고객 아이디
	private String CustomerId;
	// 고객 이름
	private String CustomerName;
	// 고객 등급
	private String CustomerGrade;
	// 보너스 포인트
	private double bonusPoint;
	// 적립비율 
	private double bonusRatio;
	// 금액
	private int Price;
	
	
	public String getCustomerId() {
		return CustomerId;
	}
	
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	
	
	public Customer() {}
	public Customer(String customerName) {
		this.CustomerName = customerName;
	
		this.CustomerGrade = "SILVER";
		this.bonusRatio = 0.01;
		
	}
	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerGrade() {
		return CustomerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		CustomerGrade = customerGrade;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public void calcPrice(int Price) {
		setPrice(Price);
		this.bonusPoint = Price * bonusRatio;
	}
	public void showCustomerInfo() {
		
		System.out.printf("%s님의 등급 : %s\n보너스 포인트는 %.1f입니다.\n",CustomerName,CustomerGrade,bonusPoint);
	}
	
	public void showStatement() {
		System.out.printf("%s 님의 지불금액은 %d입니다. \n ",CustomerName,Price);
	}


}

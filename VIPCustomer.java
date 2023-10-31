
public class VIPCustomer extends Customer{

	public VIPCustomer (String CustomerName) {
		super(CustomerName);
		super.setCustomerGrade("VIP");
		//CustomerGrade = "VIP";
		super.setBonusRatio(0.05);
		//bonusRatio = 0.05;
	}
	
	@Override
	public void calcPrice(int Price) {
		super.calcPrice(Price);
		super.setPrice((int)( Price -(Price*0.1)));
		//super.Price =(int)( Price -(Price*0.1));
	}
}

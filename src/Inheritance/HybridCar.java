package Inheritance;

public class HybridCar extends Car{

	int electricGasGauge;

	// 생성자 
	public HybridCar(int gasGauge,int electricGasGague) {
		super(gasGauge);
		System.out.println(electricGasGague);

	}
	
	
	@Override
	public void showCurrentGauge() {
		// TODO Auto-generated method stub
		super.showCurrentGauge();
		System.out.println("잔여 가스량 : " + electricGasGauge);
		
	}

}

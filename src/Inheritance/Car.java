package Inheritance;

public class Car {

	int gasGauge;
	
	public void  showCurrentGauge() {
		System.out.println("잔여 가스랑 : " + gasGauge);
	}
	
	public Car(int gasGauge) {
		this.gasGauge = gasGauge;
	}

	
}

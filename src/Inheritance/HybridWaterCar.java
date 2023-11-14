package Inheritance;

public class HybridWaterCar extends HybridCar{

	int WaterGasGauge;

	public HybridWaterCar(int gasGauge, int electricGasGauge, int waterGasGauge) {
		super(gasGauge,electricGasGauge);
		this.electricGasGauge = electricGasGauge;
		this.WaterGasGauge = waterGasGauge;
	}


	@Override
	public void showCurrentGauge() {
		// TODO Auto-generated method stub
		super.showCurrentGauge();
		System.out.println("잔여 물의 양 : " + WaterGasGauge);
	}
	
}

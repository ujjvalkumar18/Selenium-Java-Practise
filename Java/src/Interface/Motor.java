package Interface;

public class Motor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolarBatteryMotor SBM=new SolarBatteryMotor();
		SBM.StartByBattery();
		SBM.StartByElectric();

		ElectricSolarHrdroMotor ESH=new ElectricSolarHrdroMotor();
		ESH.StartByElectric();
		ESH.StartBySolar();
		ESH.StartByHydro();


	}

}

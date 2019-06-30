package Interface;

abstract interface BaseMotor{
void getspeed();
void setspeed();
void stop();
}

interface BatteryMotor{
void StartByBattery();
}

interface ElectricMotor{
void StartByElectric();
}

interface SolarMotor{
void StartBySolar();
}

interface HydroMotor{
void StartByHydro();
}


class SolarBatteryMotor implements BatteryMotor,SolarMotor{
void getspeed(){
System.out.println("Get speed for SolarBatteryMotor");
}
void setspeed(){
System.out.println("Set Speed for SolarBatteryMotor");
}
void stop(){
System.out.println("Stop the SolarBatteryMotor");
}
public void StartByBattery(){
System.out.println("Motor should Start by Battery");
}
public void StartBySolar(){
System.out.println("Motor should Start by Solar");
}
public void StartByElectric() {
	System.out.println("Motor should start by Electric");
	
}
}


class ElectricSolarHrdroMotor implements ElectricMotor,SolarMotor,HydroMotor{
void getspeed(){
System.out.println("Get speed for ElectricSolarHrdroMotor");
}
void setspeed(){
System.out.println("Set speed for ElectricSolarHrdroMotor");
}
void stop(){
System.out.println("Stop the ElectricSolarHrdroMotor");
}
public void StartByElectric(){
System.out.println("Motor should start by Electric second");
}
public void StartBySolar(){
System.out.println("Motor should start by Solar");
}
public void StartByHydro(){
System.out.println("Motor should start by Hydro");
}
}
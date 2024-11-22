package BehavioralPattern.StrategyPattern.Vehicle;

public class Vehical {

	DriveStrategy driveStrategy;
	
	Vehical(DriveStrategy driveStrategy){
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}
	
}

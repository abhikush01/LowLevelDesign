package BehavioralPattern.StrategyPattern.Vehicle;

public class SlowDrive implements DriveStrategy {

	@Override
	public void drive() {
		
		System.out.println("Slow Speed Vehical");
		
	}

}

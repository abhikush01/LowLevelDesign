package BehavioralPattern.StrategyPattern.Vehicle;

public class FastDrive implements DriveStrategy {

	@Override
	public void drive() {
		
		System.out.println("Fast Speed vehical");
	}

}

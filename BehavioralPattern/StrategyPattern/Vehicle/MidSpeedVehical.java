package BehavioralPattern.StrategyPattern.Vehicle;

public class MidSpeedVehical extends Vehical {

	MidSpeedVehical(){
		super(new MidDriveVehical());
	}
}

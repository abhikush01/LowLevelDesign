package DesignPatterns.BehavioralPattern.StrategyPattern.Vehicle;

public class LowSpeedVehical extends Vehical {

	LowSpeedVehical(){
		super(new SlowDrive());
	}
}

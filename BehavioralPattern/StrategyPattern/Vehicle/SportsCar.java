package BehavioralPattern.StrategyPattern.Vehicle;

public class SportsCar extends Vehical {

	SportsCar(){
		super(new FastDrive());
	}
	
}

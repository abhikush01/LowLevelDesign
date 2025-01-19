package DesignPatterns.BehavioralPattern.NullObjectPattern.Vehical;

public class Bike implements Vehical {

	@Override
	public int getNumberOfWheels() {
		return 2;
	}

	@Override
	public int getSeatingCapacity() {
		return 2;
	}

}

package BehavioralPattern.NullObjectPattern.Vehical;

public class Car implements Vehical {

	@Override
	public int getNumberOfWheels() {
		return 4;
	}

	@Override
	public int getSeatingCapacity() {
		return 5;
	}

}

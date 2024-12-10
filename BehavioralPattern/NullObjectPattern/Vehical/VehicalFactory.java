package BehavioralPattern.NullObjectPattern.Vehical;

public class VehicalFactory {
	public Vehical getVehical(String name) {
		if("car".equalsIgnoreCase(name)) return new Car();
		else if("bike".equalsIgnoreCase(name)) return new Bike();
		return new NullVehical();
	}
}

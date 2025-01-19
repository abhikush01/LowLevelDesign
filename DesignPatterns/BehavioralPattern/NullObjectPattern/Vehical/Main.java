package DesignPatterns.BehavioralPattern.NullObjectPattern.Vehical;

public class Main {

	public static void main(String[] args) {
		VehicalFactory factory = new VehicalFactory();
		Vehical vehical = factory.getVehical(null);
		printDetails(vehical);
	}
	
	public static void printDetails(Vehical vehical) {
		System.out.println("Number of Wheels : " + vehical.getNumberOfWheels());
		System.out.println("Seating Capacity : " + vehical.getSeatingCapacity());
	}

}

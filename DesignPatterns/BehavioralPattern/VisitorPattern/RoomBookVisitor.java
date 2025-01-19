package DesignPatterns.BehavioralPattern.VisitorPattern;

public class RoomBookVisitor implements RoomVisitor {

	@Override
	public void visit(SingleRoom room) {
		System.out.println("Single Room Booked");
	}

	@Override
	public void visit(DoubleRoom room) {
		System.out.println("Double Room Booked");
	}

	@Override
	public void visit(DeluxeRoom room) {
		System.out.println("Deluxe Room Booked");
	}

}

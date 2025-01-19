package DesignPatterns.BehavioralPattern.VisitorPattern;

public class RoomPricingVisitor implements RoomVisitor {

	@Override
	public void visit(SingleRoom room) {
		room.price = 600;
	}

	@Override
	public void visit(DoubleRoom room) {
		room.price = 1200;
	}

	@Override
	public void visit(DeluxeRoom room) {
		room.price = 2000;
	}

}

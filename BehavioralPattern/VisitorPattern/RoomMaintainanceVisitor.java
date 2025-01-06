package BehavioralPattern.VisitorPattern;

public class RoomMaintainanceVisitor implements RoomVisitor {

	@Override
	public void visit(SingleRoom room) {
		System.out.println("Maintainance Of single Room");
	}

	@Override
	public void visit(DoubleRoom room) {
		System.out.println("Maintainance Of double Room");
	}

	@Override
	public void visit(DeluxeRoom room) {
		System.out.println("Maintainance Of deluxe Room");
	}

}

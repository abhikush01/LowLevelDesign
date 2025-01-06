package BehavioralPattern.VisitorPattern;

public class DeluxeRoom extends RoomElement {

	@Override
	public void accept(RoomVisitor visitor) {
		visitor.visit(this);
	}

}

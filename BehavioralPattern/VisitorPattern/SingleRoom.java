package BehavioralPattern.VisitorPattern;

public class SingleRoom extends RoomElement {

	@Override
	public void accept(RoomVisitor visitor) {
		visitor.visit(this);
	}

}

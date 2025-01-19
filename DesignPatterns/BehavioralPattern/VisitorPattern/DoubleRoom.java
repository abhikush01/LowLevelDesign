package DesignPatterns.BehavioralPattern.VisitorPattern;

public class DoubleRoom extends RoomElement {

	@Override
	public void accept(RoomVisitor visitor) {
		visitor.visit(this);
	}

}

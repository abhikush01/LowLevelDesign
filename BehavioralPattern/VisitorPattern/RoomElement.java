package BehavioralPattern.VisitorPattern;

public abstract class RoomElement {
	
	public int price;
	RoomElement(){
		this.price = 0;	
	}
	
	public abstract void accept(RoomVisitor visitor);
	
}

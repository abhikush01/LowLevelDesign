package DesignPatterns.BehavioralPattern.VisitorPattern;

public class Main {
	public static void main(String[] args) {
		
		RoomElement singleRoom = new SingleRoom();
		RoomElement doubleRoom = new DoubleRoom();
		RoomElement deluxeRoom = new DeluxeRoom();
		
		RoomVisitor visitor = new RoomPricingVisitor();
		singleRoom.accept(visitor);
		doubleRoom.accept(visitor);
		deluxeRoom.accept(visitor);
		
		System.out.println("Price of Single Room: " + singleRoom.price);
		System.out.println("Price of Double Room: " + doubleRoom.price);
		System.out.println("Price of Deluxe Room: " + deluxeRoom.price);
		
		visitor = new RoomBookVisitor();
		doubleRoom.accept(visitor);
		
		visitor = new RoomMaintainanceVisitor();
		doubleRoom.accept(visitor);
	}
}

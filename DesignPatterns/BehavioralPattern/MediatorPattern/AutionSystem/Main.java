package DesignPatterns.BehavioralPattern.MediatorPattern.AutionSystem;

public class Main {

	public static void main(String[] args) {
		Mediator mediator = new AuctionMediator();
		
		Collegue bidder1 = new Bidder("Abhi");
		Collegue bidder2 = new Bidder("Kush");
		Collegue bidder3 = new Bidder("Abhishek");
		
		bidder1.setMediator(mediator);
		bidder2.setMediator(mediator);
		bidder3.setMediator(mediator);
		
		bidder2.placeBid(100);
		
		bidder1.placeBid(150);
		
		bidder2.placeBid(200);
		
		bidder3.placeBid(500);

	}

}

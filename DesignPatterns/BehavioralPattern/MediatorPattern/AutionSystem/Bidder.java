package DesignPatterns.BehavioralPattern.MediatorPattern.AutionSystem;

public class Bidder implements Collegue {
	private String name;
	private Mediator mediator;
	
	Bidder(String name){
		this.name = name;
	}
	
	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
		this.mediator.addBidder(this);

	}

	@Override
	public void placeBid(int amount) {
		// TODO Auto-generated method stub
		mediator.placeBid(this,amount);
	}

	@Override
	public void receiveNotification(String name, int amount) {
		// TODO Auto-generated method stub
		System.out.println("Bidder: " + name + " Bid the amount: " + amount);
	}
	
	public String getName() {
		return this.name;
	}

}

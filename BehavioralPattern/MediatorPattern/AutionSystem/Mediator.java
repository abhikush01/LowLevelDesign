package BehavioralPattern.MediatorPattern.AutionSystem;

public interface Mediator {
	public void addBidder(Collegue bidder);
	public void placeBid(Collegue bidder,int amount);
}

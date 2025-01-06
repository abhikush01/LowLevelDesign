package BehavioralPattern.MediatorPattern.AutionSystem;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
	
	private List<Collegue> bidders;
	
	AuctionMediator(){
		this.bidders = new ArrayList<>();
	}
	
	@Override
	public void addBidder(Collegue bidder) {
		// TODO Auto-generated method stub
		bidders.add(bidder);
	}

	@Override
	public void placeBid(Collegue bidder, int amount) {
		// TODO Auto-generated method stub
		for(Collegue bidr : bidders) {
			if(!bidr.getName().equals(bidder.getName())) {
				bidr.receiveNotification(bidder.getName(), amount);
			}
		}
	}

}

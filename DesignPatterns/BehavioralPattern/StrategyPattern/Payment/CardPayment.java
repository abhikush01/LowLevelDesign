package DesignPatterns.BehavioralPattern.StrategyPattern.Payment;

public class CardPayment implements PaymentStrategy {

	@Override
	public void payment() {
		
		System.out.println("Card Payment");
		
	}

	
	
}

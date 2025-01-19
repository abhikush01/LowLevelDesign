package DesignPatterns.BehavioralPattern.StrategyPattern.Payment;

public class UPIPayment implements PaymentStrategy {

	@Override
	public void payment() {
		
		System.out.println("UPI Payment");

	}

}

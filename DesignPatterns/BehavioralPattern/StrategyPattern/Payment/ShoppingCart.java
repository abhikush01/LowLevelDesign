package DesignPatterns.BehavioralPattern.StrategyPattern.Payment;

public class ShoppingCart {

	PaymentStrategy paymentStrategy;
	
	ShoppingCart(PaymentStrategy paymentStratey){
		this.paymentStrategy = paymentStratey;
	}
	
	public void payment() {
		paymentStrategy.payment();
	}
	
}

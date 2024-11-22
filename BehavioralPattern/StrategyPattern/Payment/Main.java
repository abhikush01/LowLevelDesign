package BehavioralPattern.StrategyPattern.Payment;

public class Main {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart(new CardPayment());
		cart.payment();
	}

}

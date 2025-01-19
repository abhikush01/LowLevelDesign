package DesignPatterns.BehavioralPattern.TemplateMethodPattern;

public abstract class Payment {
	
	public abstract void validateRequest();
	public void debitMoney() {
		System.out.println("Debit the money");
	}
	public abstract void calculateFees();
	public void creditMoney() {
		System.out.println("Credit the money");
	}
	
	public final void sendMoney() {
		
		validateRequest();
		debitMoney();
		calculateFees();
		creditMoney();
	}
	
}

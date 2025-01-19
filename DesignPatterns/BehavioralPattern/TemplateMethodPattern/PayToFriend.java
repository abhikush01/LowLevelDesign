package DesignPatterns.BehavioralPattern.TemplateMethodPattern;

public class PayToFriend extends Payment {

	@Override
	public void validateRequest() {
		System.out.println("Validate logic for paying to friend");
	}

	@Override
	public void calculateFees() {
		System.out.println("0% Charges");
	}

}

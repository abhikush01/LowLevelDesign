package BehavioralPattern.TemplateMethodPattern;

public class PayToMerchant extends Payment {

	@Override
	public void validateRequest() {
		System.out.println("Validate logic for paying to Merchant");
	}

	@Override
	public void calculateFees() {
		System.out.println("2% Charges");
	}

}

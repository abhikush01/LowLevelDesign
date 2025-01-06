package BehavioralPattern.TemplateMethodPattern;

public class Main {
	public static void main(String[] args) {
		Payment payment = new PayToMerchant();
		payment.sendMoney();
	}
}

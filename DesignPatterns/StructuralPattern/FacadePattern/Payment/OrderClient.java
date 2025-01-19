package DesignPatterns.StructuralPattern.FacadePattern.Payment;

public class OrderClient {

	public static void main(String[] args) {
		
		PaymentFacade payment = new PaymentFacade();
		payment.createPayment();

	}

}

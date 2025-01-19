package DesignPatterns.StructuralPattern.FacadePattern.Payment;

public class PaymentFacade {
	
	Product product;
	Payment payment;
	Invoice invoice;
	Notification notification;
	
	PaymentFacade(){
		this.product = new Product();
		this.payment = new Payment();
		this.invoice = new Invoice();
		this.notification = new Notification();
	}
	
	public void createPayment(){
		String pro = product.getProduct();
		payment.makePayment();
		invoice.generateInvoice();
		notification.sendNotification();
	}
	
}

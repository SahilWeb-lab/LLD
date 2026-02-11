package factory.abstractt.method;

public class Client {

	public static void main(String[] args) {
		PaymentFactory paymentFactory;
		
//		Razor Pay:
		paymentFactory = new RazorpayFactory();
		PaymentProcessor payment = paymentFactory.createPayment();
		payment.pay(5000);
		
		RefundProcessor refundPayment = paymentFactory.refundPayment();
		refundPayment.refund(4000);
		
//		Stripe Payment:
		paymentFactory = new StripeFactory();
		
//		Pay
		PaymentProcessor paymentProcessor = paymentFactory.createPayment();
		paymentProcessor.pay(10000);
		
//		Refund:
		RefundProcessor refundPayment2 = paymentFactory.refundPayment();
		refundPayment2.refund(10000);
	}
	
}

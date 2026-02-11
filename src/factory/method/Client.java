package factory.method;

public class Client {

	public static void main(String[] args) {
		PaymentFactory paymentFactory = null;
		
//		Pay using UPI
		paymentFactory = new UPIFactory();
		paymentFactory.processPayment(4000);
		
//		Pay using Credit Card:
		paymentFactory = new CreditCardFactory();
		paymentFactory.processPayment(9999);
	}
	
}

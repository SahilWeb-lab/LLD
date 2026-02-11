package factory.simple;

public class PaymentFactory {

	public static Payment getPayment(String paymentType) {
		if(paymentType.equalsIgnoreCase("upi"))
			return new UpiPayment();
		else if(paymentType.equalsIgnoreCase("creditCard"))
			return new CreditCardPayment();
		else
			throw new IllegalArgumentException("Invalid Payment Type!!");
	}
	
}

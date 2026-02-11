package factory.simple;

public class Client {

	public static void main(String[] args) {
		String paymentType = "upi";
		
//		Pay Using UPI:
		Payment payment = PaymentFactory.getPayment(paymentType);
		payment.pay(5000);
		
//		Pay Using Credit Card:
		paymentType = "creditCard";
		Payment payment2 = PaymentFactory.getPayment(paymentType);
		payment2.pay(6000);
	}
	
}

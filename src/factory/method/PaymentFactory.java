package factory.method;

public abstract class PaymentFactory {

	// Factory Method
	public abstract Payment createPayment();

	// Common method
	public void processPayment(double amount) {
		Payment payment = createPayment();
		payment.pay(amount);
	}

}

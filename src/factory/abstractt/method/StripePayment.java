package factory.abstractt.method;

public class StripePayment implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		System.out.println("Processing ₹" + amount + " using Stripe");
	}

}

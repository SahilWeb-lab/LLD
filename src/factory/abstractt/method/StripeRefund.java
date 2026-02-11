package factory.abstractt.method;

public class StripeRefund implements RefundProcessor {

	@Override
	public void refund(double amount) {
		  System.out.println("Refunding ₹" + amount + " using Stripe");
	}

}

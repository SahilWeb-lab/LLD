package factory.abstractt.method;

public class RazorpayPayment implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		 System.out.println("Processing ₹" + amount + " using Razorpay");
	}

}

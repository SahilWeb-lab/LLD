package factory.abstractt.method;

public class RazorpayRefund implements RefundProcessor {

	@Override
	public void refund(double amount) {
		 System.out.println("Refunding ₹" + amount + " using Razorpay");
	}

}

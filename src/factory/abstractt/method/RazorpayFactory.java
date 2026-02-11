package factory.abstractt.method;

public class RazorpayFactory implements PaymentFactory {

	@Override
	public PaymentProcessor createPayment() {
		return new RazorpayPayment();
	}

	@Override
	public RefundProcessor refundPayment() {
		// TODO Auto-generated method stub
		return new RazorpayRefund();
	}

}

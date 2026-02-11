package factory.abstractt.method;

public class StripeFactory implements PaymentFactory {

	@Override
	public PaymentProcessor createPayment() {
		return new StripePayment();
	}

	@Override
	public RefundProcessor refundPayment() {
		// TODO Auto-generated method stub
		return new StripeRefund();
	}

}

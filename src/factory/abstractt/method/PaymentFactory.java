package factory.abstractt.method;

public interface PaymentFactory {
	PaymentProcessor createPayment();
	RefundProcessor refundPayment();
}

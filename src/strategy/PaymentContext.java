package strategy;

public class PaymentContext {

	private PaymentSystem paymentSystem;

	public void setPaymentSystem(PaymentSystem paymentSystem) {
		this.paymentSystem = paymentSystem;
	}
	
	public void pay(double amount) {
		paymentSystem.pay(amount);
	}
}

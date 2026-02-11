package factory.method;

public class UPIFactory extends PaymentFactory {

	@Override
	public Payment createPayment() {
		return new UpiPayment();
	}

}

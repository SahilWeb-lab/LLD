package strategy;

public class UpiPayment implements PaymentSystem {

	private String upiId;
	
	public UpiPayment(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public void pay(double amount) {
		 System.out.println("Paid " + amount + " using UPI: " + upiId);
	}

}

package strategy;

public class NetBankingPayment implements PaymentSystem {
	
	private String transactionId;
	
	public NetBankingPayment(String transactionId) {
		this.transactionId = transactionId;
	}


	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using Net Banking: " + transactionId);
	}

}

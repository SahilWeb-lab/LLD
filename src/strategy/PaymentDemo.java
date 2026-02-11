package strategy;

public class PaymentDemo {

	public static void main(String[] args) {
		PaymentContext paymentContext = new PaymentContext();
		
//		Pay with credit card:
		paymentContext.setPaymentSystem(new CreditCardPayment("1234-5678-9876-5432"));
		paymentContext.pay(500);
		
//		Pay with net banking:
		paymentContext.setPaymentSystem(new NetBankingPayment("fjdiudi3434fddds"));
		paymentContext.pay(3000);
		
//		Pay with paypal:
		paymentContext.setPaymentSystem(new PayPalPayment("mandalsahil253@gmail.com"));
		paymentContext.pay(9000);
		
//		Pay with upi:
		paymentContext.setPaymentSystem(new UpiPayment("mandalsahil25@oksbi"));
		paymentContext.pay(70000);
	}
	
}

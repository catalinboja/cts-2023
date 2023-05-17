package ro.ase.cts.design.patterns.strategy;

public class MonthlySubscription {

	float amount;
	String username;
	
	PaymentInterface paymentMethod = null;
	
	public MonthlySubscription(float amount, String username) {
		super();
		this.amount = amount;
		this.username = username;
	}

	public void pay() {
		if(this.paymentMethod != null) {
			this.paymentMethod.executePayment(amount);
		}
		else
		{
			throw new UnsupportedOperationException();
		}
	}
	
	public void setPaymentMethod(PaymentInterface payment) {
		this.paymentMethod = payment;
	}
	
}

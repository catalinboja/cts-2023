package ro.ase.cts.design.patterns.strategy;

public class PayPalService implements PaymentInterface{

	@Override
	public void executePayment(float amount) {
		System.out.println("PayPal service: paying " + amount);
	}

}

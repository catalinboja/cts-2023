package ro.ase.cts.design.patterns.strategy;

public class BankAccount implements PaymentInterface{

	@Override
	public void executePayment(float amount) {
		System.out.println("Bank transaction: " + amount);
	}

}

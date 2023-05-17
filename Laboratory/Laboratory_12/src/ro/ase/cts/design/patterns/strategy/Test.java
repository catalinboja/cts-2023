package ro.ase.cts.design.patterns.strategy;

public class Test {

	public static void main(String[] args) {
		
		MonthlySubscription userSubscription = 
				new MonthlySubscription(100, "superman");
		
		userSubscription.setPaymentMethod(new PayPalService());
		
		userSubscription.pay();
		
		userSubscription.setPaymentMethod(new BankAccount());
		
		userSubscription.pay();
	}

}

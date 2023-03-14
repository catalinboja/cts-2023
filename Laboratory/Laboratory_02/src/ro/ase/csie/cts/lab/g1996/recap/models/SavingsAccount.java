package ro.ase.csie.cts.lab.g1996.recap.models;

import ro.ase.csie.cts.lab.g1996.recap.exceptions.InsufficientFundsException;

public class SavingsAccount extends BankAccount {

	public static final double MIN_BALANCE = 100;
	
	public SavingsAccount(double balance, String iban) {
		super(balance, iban);
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount + MIN_BALANCE > this.balance)
			throw new InsufficientFundsException("No more money!");
		this.balance -= amount;
	}
}

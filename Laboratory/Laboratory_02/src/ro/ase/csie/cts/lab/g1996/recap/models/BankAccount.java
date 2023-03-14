package ro.ase.csie.cts.lab.g1996.recap.models;

import ro.ase.csie.cts.lab.g1996.recap.exceptions.IllegalTransferException;
import ro.ase.csie.cts.lab.g1996.recap.exceptions.InsufficientFundsException;

public abstract class BankAccount extends Account{
	protected double balance;
	protected String iban;
	
	
	public BankAccount(double balance, String iban) {
		super();
		this.balance = balance;
		this.iban = iban;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void transfer(Account destination, double amount) 
			throws IllegalTransferException, InsufficientFundsException {
		
		BankAccount destinationAccount = null;
		
		if(destination instanceof BankAccount) {
			destinationAccount = (BankAccount) destination;
		} else {
			throw new IllegalTransferException();
		}
		
		if(this == destination || 
				this.iban.equals(destinationAccount.iban)) {
			throw new IllegalTransferException();
		}
		this.withdraw(amount);
		destination.deposit(amount);
	}
	
	
	
}

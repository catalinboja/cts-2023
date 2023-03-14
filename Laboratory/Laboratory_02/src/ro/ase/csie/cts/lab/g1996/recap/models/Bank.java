package ro.ase.csie.cts.lab.g1996.recap.models;

import java.util.HashMap;

public class Bank {
	String name;
	int nextIBAN;
	
	HashMap<String, BankAccount> accounts = 
			new HashMap<>();
	
	public Bank(String name) {
		this.name = name;
		this.nextIBAN = 1;
	}
	
	public BankAccount openAccount(AccountType type) {
		
		String nextIbanValue = 
				this.name+(this.nextIBAN++);
		
		BankAccount newAccount = null;
		
		switch(type) {
		case CREDIT:
			newAccount = new CurrentAccount(nextIbanValue);
			break;
		case SAVINGS:
			newAccount = new SavingsAccount(
					SavingsAccount.MIN_BALANCE, nextIbanValue);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		this.accounts.put(nextIbanValue, newAccount);
		return newAccount;
	}
}

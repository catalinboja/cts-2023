package ro.ase.csie.cts.lab.g1996.recap.models;

import ro.ase.csie.cts.lab.g1996.recap.exceptions.IllegalTransferException;
import ro.ase.csie.cts.lab.g1996.recap.exceptions.InsufficientFundsException;

public abstract class Account {
	
	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount) 
			throws InsufficientFundsException;
	public abstract void transfer(Account destination, double amount) 
			throws IllegalTransferException, InsufficientFundsException;
}

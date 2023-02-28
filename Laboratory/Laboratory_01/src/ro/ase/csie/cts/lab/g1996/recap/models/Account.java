package ro.ase.csie.cts.lab.g1996.recap.models;

public abstract class Account {
	
	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void transfer(Account destination, double amount);
}

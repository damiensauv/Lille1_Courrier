package model;

public class BankAccount
{
	public int amount;

	public BankAccount(int initAmount) {
		super();
		this.amount = initAmount;
	}

	public int getAmount()
	{
		return this.amount;
	}

	public void credit(int amount) {
		this.amount += amount;
	}


	public void debit(int amount) {
		this.amount -= amount;
	}
	
}


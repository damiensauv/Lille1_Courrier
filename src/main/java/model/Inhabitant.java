package model;

public class Inhabitant
{
	public String name;
	public BankAccount bankAccount;

	public Inhabitant(int nb){
		super();
		this.name = "inhabitant-" + String.valueOf(nb);
        this.bankAccount = new BankAccount(5000);
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}


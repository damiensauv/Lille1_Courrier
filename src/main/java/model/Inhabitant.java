package model;

public class Inhabitant
{
	public String name;
	public BankAccount bankAccount;
    public City city;

	public Inhabitant(int nb, City city){
		super();
        this.city = city;
		this.name = "inhabitant-" + String.valueOf(nb);
        this.bankAccount = new BankAccount(5000);
	}

    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
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


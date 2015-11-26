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

    /**
     * @return city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return bankAccount
     */
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     *
     * @param bankAccount
     */
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}


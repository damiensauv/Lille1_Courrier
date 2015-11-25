package model;

import java.util.ArrayList;
import java.util.List;

public class City
{
	public String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter> postBox;

	public City(String name){
		super();
		this.inhabitants = new ArrayList<Inhabitant>();
		this.postBox = new ArrayList<Letter>();
		this.name = name;
	}

	public List<Letter> getPostBox()
	{
		return postBox;
	}

	public void generateInhabitant(int inhabitant) {
		int i = 0;
		while (i < inhabitant){
			this.inhabitants.add(new Inhabitant(i + 1, this));
			i++;
		}
	}

	public int randomOfLettersInhabitants(int max){
		return (int)(0 + (Math.random() * (max - 0)));
	}

	public void cityCreateLetter(int nbLetters){

		int idSend, idReceiv;
		int i = 0;
		int typeLetters;

		while (i < nbLetters) {
			idSend = this.randomOfLettersInhabitants(99);
			while ((idReceiv = this.randomOfLettersInhabitants(99)) != idSend);

			typeLetters = this.randomOfLettersInhabitants(4);
			if (typeLetters == 0)
				this.createSimpleLetters(inhabitants.get(idSend), inhabitants.get(idReceiv));
			else if (typeLetters == 1)
				this.createPromiseLetters(inhabitants.get(idSend), inhabitants.get(idReceiv));
			else if (typeLetters == 2)
				this.createRegistredLetters(inhabitants.get(idSend), inhabitants.get(idReceiv));
			else if (typeLetters == 3)
				this.createUrgentLetters(inhabitants.get(idSend), inhabitants.get(idReceiv));
			i++;
		}
	}

	private void createUrgentLetters(Inhabitant inhabitant, Inhabitant inhabitant1) {
	}


	private void createRegistredLetters(Inhabitant inhabitant, Inhabitant inhabitant1) {
	}


	private void createPromiseLetters(Inhabitant inhabitant, Inhabitant inhabitant1) {
	}

	private void createSimpleLetters(Inhabitant inhabitant, Inhabitant inhabitant1) {
	}


	public void sendLetter() {

		int nbLetters = this.randomOfLettersInhabitants(10);

		this.cityCreateLetter(10);
		
		Letter letter = new SimpleLetter(inhabitants.get(0), inhabitants.get(1), "bla bla");

		if (letter.getSender().getBankAccount().getAmount() >= letter.getCost())
		{			
			postBox.add(letter);
			letter.getSender().getBankAccount().debit(letter.getCost());
			System.out.println("-> " + letter.getSender().getName() + " mails a simple letter whose content is a text content "
				+ letter.getContent() + " to " + letter.getReceiver().getName() + "for a cost of " + letter.getCost() + " euros");
			System.out.println("-" + letter.getCost() + " euros are debited from " + letter.getSender().getName() + " account whose balance is now "
				+ letter.getSender().getBankAccount().getAmount() + " euros");
		}
		else
			System.out.println("-> " + letter.getSender().getName() + "doesn't have enough money to send" + letter.getType());

		// methode just display
		// random nb letters a cree
		// random type letter
		// random sur exp, dest

	// trace
	}

	public void distributeLetters()
	{
		for (Letter l : postBox)
		{
			l.doAction();
		}

		// trace

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}


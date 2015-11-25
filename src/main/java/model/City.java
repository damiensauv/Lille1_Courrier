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

	public ArrayList<Letter> getPostBox()
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

	public void sendLetter() {

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


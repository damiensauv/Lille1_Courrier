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

	public void generateInhabitant(int inhabitant) {
		int i = 0;
		while (i < inhabitant){
			this.inhabitants.add(new Inhabitant(i + 1, this));
			i++;
		}
	}

	public void sendLetter() {

		Letter letter = new SimpleLetter(inhabitants.get(0), inhabitants.get(1), "bla bla");

		postBox.add(letter);

		System.out.println(letter.getSender().getName() + " mails a simple letter whose content is a text content "
				+ letter.getContent() + " to " + letter.getReceiver().getName() + "for a cost of " + letter.getCost() + " euros");


		// methode just display
		// random nb letters a cree
		// random type letter
		// random sur exp, dest

	// trace
	}

	public void distributeLetters() {

		// trace

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}


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
		int nbRadom;
		Letter<?> letter;

		while (i < nbLetters){
			idSend = this.randomOfLettersInhabitants(99);
			idReceiv = this.randomOfLettersInhabitants(99);

			nbRadom = this.randomOfLettersInhabitants(10);
			if ((nbRadom % 2) == 0)
				letter = new SimpleLetter(inhabitants.get(idSend), inhabitants.get(idReceiv), "BlaBla");
			else
				letter = new PromissoryNote(inhabitants.get(idSend), inhabitants.get(idReceiv), this.randomOfLettersInhabitants(300));

/*			nbRadom = this.randomOfLettersInhabitants(10);
			if ((nbRadom % 2) == 0)
*/
//			letter = new RegisteredLetter(letter.getSender(), letter.getReceiver(), (NotUrgentLetter)letter);

			letter = new UrgentLetter(letter.getSender(), letter.getReceiver(), (NotUrgentLetter) letter);




			this.postBox.add(letter);

			i++;
		}
	}


	public void sendLetter() {

		int nbLetters = this.randomOfLettersInhabitants(10);
		this.cityCreateLetter(nbLetters);
		
		for (Letter l : postBox)
		{
			l.displaySend();
		}

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


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

	}

	public void distributeLetters() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}


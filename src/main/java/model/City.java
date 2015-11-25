package model;

import java.util.ArrayList;
import java.util.List;

public class City
{
	public String name;
	protected List<Inhabitant> inhabitants;
//	protected List<Letter> postBox;
	// not sure ??

	public City(String name){
		super();
		this.inhabitants = new ArrayList<Inhabitant>();
		// new list of Letter/PostBox
		this.name = name;
	}

	public void generateInhabitant(int inhabitant) {
		int i = 0;
		while (i < inhabitant){
			this.inhabitants.add(new Inhabitant(i + 1));
			i++;
		}
	}

	public void sendLetter() {
		// TODO implement me	
	}

	public void distributeLetters() {
		// TODO implement me	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}


package model.letter;

import model.Inhabitant;

public class UrgentLetter extends Letter<NotUrgentLetter>
{
	public UrgentLetter(Inhabitant sender, Inhabitant receiver, NotUrgentLetter content){
		super(sender, receiver);
		this.content = content;
		this.cost = content.getCost() * 2;
	}

	@Override
	public void doAction() {

	}

    @Override
	public String contentInside() {
		return "an urgent letter whose is " + this.getContent().contentInside();
	}
}


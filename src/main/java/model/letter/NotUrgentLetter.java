package model.letter;

import model.Inhabitant;

public abstract class NotUrgentLetter<T> extends Letter<T>
{
	public RegisteredLetter urgentLetter;

	public UrgentLetter registeredLetter;

	public NotUrgentLetter(Inhabitant sender, Inhabitant receiver){
		super(sender, receiver);


	}

	public abstract void displaySend();

}


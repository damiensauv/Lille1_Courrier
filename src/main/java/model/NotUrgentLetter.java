package model;

public abstract class NotUrgentLetter extends Letter
{
	public RegisteredLetter urgentLetter;

	public UrgentLetter registeredLetter;

	public NotUrgentLetter(Inhabitant sender, Inhabitant receiver){
		super(sender, receiver);


	}

	public abstract void displaySend();

}


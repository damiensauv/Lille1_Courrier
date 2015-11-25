package model;


public class RegisteredLetter extends NotUrgentLetter
{
	public NotUrgentLetter letter;

	public RegisteredLetter(Inhabitant sender, Inhabitant receiver, NotUrgentLetter content){
		super(sender, receiver);


	}

}


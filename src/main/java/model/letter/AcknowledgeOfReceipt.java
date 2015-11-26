package model.letter;


import model.Inhabitant;

public class AcknowledgeOfReceipt extends NotUrgentLetter
{
	public AcknowledgeOfReceipt(Inhabitant sender, Inhabitant receiver, String content){
		super(sender, receiver);

	}

	public void doAction()
	{
		
	}

	@Override
	public void displaySend() {

	}

	@Override
	public String displayInside() {
		return "";
	}
}


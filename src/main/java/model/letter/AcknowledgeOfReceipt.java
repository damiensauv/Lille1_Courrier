package model.letter;


import model.Inhabitant;

public class AcknowledgeOfReceipt extends NotUrgentLetter<String>
{
	public AcknowledgeOfReceipt(Inhabitant sender, Inhabitant receiver, String content){
		super(sender, receiver);
		this.content = content;
	}

	public void doAction()
	{
	}

	@Override
	public String contentInside() {
		return "an acknowledgment of receipt which is " + this.getContent();
	}
}


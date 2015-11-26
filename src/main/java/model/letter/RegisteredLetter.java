package model.letter;


import model.CannotAffordLetterException;
import model.Inhabitant;

public class RegisteredLetter extends NotUrgentLetter<NotUrgentLetter>
{
	public RegisteredLetter(Inhabitant sender, Inhabitant receiver, NotUrgentLetter content){
		super(sender, receiver);
		this.content = content;
		this.cost = content.getCost() + 15;
	}

	@Override
	public void doAction()
	{
		this.getContent().doAction();
		String receipt = this.getContent().contentInside();
		AcknowledgeOfReceipt acknowReceipt = new AcknowledgeOfReceipt(this.getReceiver(), this.getSender(), receipt);
		try {
			this.sender.getCity().getPostBox().post(acknowReceipt);
		} catch (CannotAffordLetterException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String contentInside() {
		return "a registered letter whose content is " + this.getContent().contentInside();
	}

}


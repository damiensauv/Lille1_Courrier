package model;


public class RegisteredLetter extends NotUrgentLetter
{
	public RegisteredLetter(Inhabitant sender, Inhabitant receiver, NotUrgentLetter content){
		super(sender, receiver);
		this.content = content;
		this.cost = content.getCost() + 15;
	}

	@Override
	public void doAction()
	{
		super.doAction();
		String receipt = "Aknoledgment of recepipt for a registered letter whose content is a " + super.getType() + " whose content is : " + this.getContent();
		AcknowledgeOfReceipt acknowReceipt = new AcknowledgeOfReceipt(this.getReceiver(), this.getSender(), receipt);
		this.sender.getCity().getPostBox().add(acknowReceipt);
	}

	@Override
	public NotUrgentLetter getContent(){
		return (NotUrgentLetter) this.content;
	}

}

